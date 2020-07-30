package com.walkover.sample.util;

public  final class ScraperConstants {

    private ScraperConstants(){
        throw new AssertionError();
    }


    public static final String API_BASE_URI = "https://contextualwebsearch-websearch-v1.p.rapidapi.com/api/Search/NewsSearchAPI";
    public static final String API_KEY = "77ccfe16d6msh9f537311711464cp11bd9ejsn3383e21683bd";

    public static final  int PARQUET_BLOCK_SIZE = 256 * 1024 * 1024;
    public static final int PARQUET_PAGE_SIZE = 64 * 1024;

    public static final String PARQUET_OUTPUT_FILE_LOCATION = "./output/sample.parquet";

    public static final int WORKER_THREAD_SIZE = 5;
    public static final int REQUEST_POOL_SIZE = 10;


    public static final String AVRO_SCHEMA_FILE_NAME = "newsrecord.avsc";
}
