package com.walkover.sample.main;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.walkover.sample.util.CommonUtils;
import com.walkover.sample.util.ScraperConstants;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import parquet.avro.AvroParquetWriter;
import parquet.avro.AvroSchemaConverter;
import parquet.avro.AvroWriteSupport;
import parquet.hadoop.api.WriteSupport;
import parquet.hadoop.metadata.CompressionCodecName;
import parquet.schema.MessageType;
import tech.allegro.schema.json2avro.converter.JsonAvroConverter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Main {

    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args)  {

        String textToSearch = args[0];

        Service service = new Service();

        JSONObject apiresponse = service.getNewsResponseFromAPI();
        logger.log(Level.INFO,"API response received");

        String jsonStr = CommonUtils.tagResponseWithPos(apiresponse).toString();
        logger.log(Level.INFO,"API response tagged with POS");

        service.writeResponseToParquet(jsonStr);
        logger.log(Level.INFO,"API response written to Parquet");

        List<String> nounList = service.readParquetWithSpark(ScraperConstants.PARQUET_OUTPUT_FILE_LOCATION);
        int nounIndex = service.binarySearchOnNounList(nounList,textToSearch);
    }

}


