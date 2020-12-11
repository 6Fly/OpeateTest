package com.cfam.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class JsonParsingService {
    public JSONArray parsJson(){
        String json = "{\"code\":\"0\",\"msg\":\"成功\",\"data\":[{\"BQAP(AH)TJ202011090001.pdf\":{\"thumbnail\":\"http://carcredit-ample.oss-cn-beijing.aliyuncs.com/BQAP%28AH%29TJ202011090001.pdf?Expires=1604915037&OSSAccessKeyId=LTAI4FoV6VEzH2XPDcwTrceC&Signature=3zitNeBr5gxBVbDOdjkn6%2BiuCP0%3D\",\"url\":\"http://carcredit-ample.oss-cn-beijing.aliyuncs.com/BQAP%28AH%29TJ202011090001.pdf?Expires=1604915037&OSSAccessKeyId=LTAI4FoV6VEzH2XPDcwTrceC&Signature=3zitNeBr5gxBVbDOdjkn6%2BiuCP0%3D\"}}]}";
        JSONObject jsonObject = JSONObject.fromObject(json);
        JSONArray data = jsonObject.getJSONArray("data");
        return data;
    }
}
