package com.walkover.sample.main;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.walkover.sample.model.ResponseObject;
import com.walkover.sample.util.ScraperConstants;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.concurrent.Callable;

public class GetJsonResponse implements Callable {
    static Logger logger = Logger.getLogger(GetJsonResponse.class);


    ResponseObject reponseTo;

    public GetJsonResponse(ResponseObject to) {
        reponseTo = to;
    }


    @Override
    public HttpResponse<JsonNode> call() throws Exception {
        HttpResponse<JsonNode> response = null;
        try {

            response = Unirest.get(ScraperConstants.API_BASE_URI)
                    .header("X-RapidAPI-Key", ScraperConstants.API_KEY)
                    .queryString("autoCorrect", reponseTo.getAutoCorrect())
                    .queryString("pageNumber", reponseTo.getPageNumber())
                    .queryString("pageSize", reponseTo.getPageSize())
                    .queryString("q", reponseTo.getQ())
                    .queryString("safeSearch", reponseTo.getSafeSearch())
                    .asJson();
        } catch (UnirestException e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        logger.log(Level.INFO, "Page Number : " + reponseTo.getPageNumber() + "output->>>" + response);
        return response;
    }
}
