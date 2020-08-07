package com.cfam.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping(value = "/oatea")
    public String oatea() {
        String aa = "aaaaa";
        String bb = null;
        if (aa.equals(bb)){
            return "1";
        }else {
            return "2";
        }
    }
}
