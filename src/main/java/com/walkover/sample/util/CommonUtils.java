
package com.walkover.sample.util;

import com.walkover.sample.main.Service;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSSample;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;

public class CommonUtils {
    static Logger logger = Logger.getLogger(Service.class);

    static ClassLoader classLoader = CommonUtils.class.getClassLoader();

    // get file from classpath, resources folder
    public static File getFileFromResources(String fileName) {

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
    }


    public static POSTaggerME getTaggerFromResources(String fileName) throws IOException {

        InputStream fileInputStream = null;

        URL resource = classLoader.getResource(fileName);
        fileInputStream = new FileInputStream(resource.getFile());
        POSModel model = new POSModel(fileInputStream);
        POSTaggerME tagger = new POSTaggerME(model);
        return tagger;
    }


    public static JSONObject tagResponseWithPos(JSONObject apiresponse){
        POSTaggerME tagger = null;
        try {
            tagger = getTaggerFromResources("en-pos-maxent.bin");
        } catch (IOException e) {
            logger.log(Level.ERROR, e.getMessage());
        }

        JSONArray keys = apiresponse.names();
        for (Object key: keys) {
            if ("value".equals(key)) {
                JSONArray jArray = apiresponse.getJSONArray("value");
                for (int j = 0; j < jArray.length(); j++) {
                    JSONObject object = jArray.optJSONObject(j);
                    Iterator<String> iterator = object.keys();
                    while (iterator.hasNext()) {
                        String currentKey = iterator.next();
                        if (currentKey.equals("description")) {
                            String oldDesc = object.getString(currentKey);
                            WhitespaceTokenizer whitespaceTokenizer= WhitespaceTokenizer.INSTANCE;
                            String[] tokens = whitespaceTokenizer.tokenize(oldDesc);
                            String[] tags = tagger.tag(tokens);
                            POSSample sample = new POSSample(tokens, tags);
                            String newsDesc = sample.toString();
                            object.put("description", newsDesc);
                        }
                    }
                }
            }
        }

        return apiresponse;
    }



}
