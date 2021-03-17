package com.cfam.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAsync
public class FeeCalTest {
    @Autowired
    private CalculationService calculationService;

    public void calTest(){
        calculationService.calAmount("23", "1", "10000");
    }
}
