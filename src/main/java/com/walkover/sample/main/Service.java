package com.walkover.sample.main;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.walkover.sample.model.NounText;
import com.walkover.sample.model.ResponseObject;
import com.walkover.sample.util.CommonUtils;
import com.walkover.sample.util.ScraperConstants;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.json.JSONObject;
import parquet.avro.AvroParquetWriter;
import parquet.avro.AvroSchemaConverter;
import parquet.avro.AvroWriteSupport;
import parquet.hadoop.api.WriteSupport;
import parquet.hadoop.metadata.CompressionCodecName;
import parquet.schema.MessageType;
import tech.allegro.schema.json2avro.converter.JsonAvroConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Service {

    static Logger logger = Logger.getLogger(Service.class);

    public JSONObject getNewsResponseFromAPI() {
        ExecutorService executorService = Executors.newFixedThreadPool(ScraperConstants.WORKER_THREAD_SIZE);

        List<Callable<HttpResponse<JsonNode>>> callableTasks = new ArrayList<Callable<HttpResponse<JsonNode>>>();
        int i = 0;
        while (i < ScraperConstants.REQUEST_POOL_SIZE) {
            ResponseObject responseObject = new ResponseObject.ResponseBuilder(
                    "" + i, "50", "Taylor Swift").build();
            callableTasks.add(new GetJsonResponse(responseObject));
            i++;
        }

        List<Future<HttpResponse<JsonNode>>> futures = null;
        try {
            futures = executorService.invokeAll(callableTasks);
        } catch (InterruptedException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        executorService.shutdown();
        String value = futures.stream().map(e -> {
            try {
                return e.get().getBody().toString();
            } catch (InterruptedException | ExecutionException ex) {
                logger.log(Level.ERROR, ex.getMessage());
            }
            return "";
        }).reduce("", String::concat);

        JSONObject apiResponse = new JSONObject(value);

        return apiResponse;
    }



    public void writeResponseToParquet(String jsonStr) {

        try {
            Schema avroSchema = Schema.parse(CommonUtils.getFileFromResources("newsrecord.avsc"));
            JsonAvroConverter converter = new JsonAvroConverter();
            GenericData.Record record = converter.convertToGenericDataRecord(jsonStr.getBytes(), avroSchema);

            MessageType parquetSchema = new AvroSchemaConverter().convert(avroSchema);

            CompressionCodecName compressionCodecName = CompressionCodecName.UNCOMPRESSED;

            final WriteSupport writeSupport = new AvroWriteSupport(parquetSchema, avroSchema);
            final String parquetFile = ScraperConstants.PARQUET_OUTPUT_FILE_LOCATION;
            Path path = new Path(parquetFile);

            AvroParquetWriter parquetWriter = null;
            parquetWriter = new AvroParquetWriter(path,
                    avroSchema, compressionCodecName, ScraperConstants.PARQUET_BLOCK_SIZE, ScraperConstants.PARQUET_PAGE_SIZE);

            parquetWriter.write(record);
            parquetWriter.close();
        } catch (IOException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
    }

    public List<String> readParquetWithSpark(String filePath) {
        SparkSession spark = SparkSession
                .builder()
                .appName("News Scraper")
                .config("spark.master", "local")
                .getOrCreate();

        Dataset<Row> parquetFileDF = spark.read().parquet(filePath);


        parquetFileDF.createOrReplaceTempView("parquetFile");

        Dataset<Row> newsTitleDF = spark.sql("SELECT value FROM parquetFile limit 10");
        Dataset<String> namesDS = newsTitleDF.map(
                (MapFunction<Row, String>) row -> "Name: " + row.getList(0),
                Encoders.STRING());
        List<String> valueList = namesDS.javaRDD().collect();

        List<String> filteredNounList = valueList.stream()
                .filter(s -> s.endsWith("_NN")).collect(Collectors.toList());

        return filteredNounList;
    }

    public int binarySearchOnNounList(List<String> nounList, String textToSearch){
        List<NounText> nounTextList = new ArrayList<NounText>();
        for (String noun : nounList) {
            nounTextList.add(new NounText.NounBuilder(noun).build());
        }

        Collections.sort(nounTextList);
        int index = Collections.binarySearch(nounTextList, new NounText.NounBuilder(textToSearch).build());
        return index;
    }

}
