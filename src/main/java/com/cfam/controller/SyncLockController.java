package com.cfam.controller;

import com.alibaba.fastjson.JSON;
import com.cfam.annotation.Synclock;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author L
 */
@RestController
public class SyncLockController {


    @Synclock
    @RequestMapping(value = "/getNotice",method = RequestMethod.POST)
    public String getNotice(@RequestBody Map map){

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正常方法");
        Map map1 = new HashMap<>();
        return JSON.toJSONString(map1);
    }

}
