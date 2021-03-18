package com.project.pratice.service;

import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParsTest {
    @Autowired
    private   JsonParsingService jsonParsingService;
    @Test
    public void  parsTest(){
        Object ossFile = jsonParsingService.parsJson().get(0);
        System.out.println(JSONObject.fromObject(ossFile).getJSONObject("BQAP(AH)TJ202011090001.pdf"));
    }
}
