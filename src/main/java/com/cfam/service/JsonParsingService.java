package com.cfam.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class JsonParsingService {
    public JSONArray parsJson(){
        String json = "";
        JSONObject jsonObject = JSONObject.fromObject(json);
        JSONArray data = jsonObject.getJSONArray("data");
        return data;
    }
}
