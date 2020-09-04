package com.cfam.service;

import com.cfam.service.Shop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAsync
public class AsyncSpring {
    @Autowired
    private Shop shop;
    @Test
    public void shopTest() throws IOException {

        long la = System.currentTimeMillis();
        shop.getPrice();
        System.out.println(System.currentTimeMillis()-la);

        long lb = System.currentTimeMillis();
        Future<Double> asyncPrice = shop.getAsyncPrice();
        System.out.println(System.currentTimeMillis()-lb);

        long lc = System.currentTimeMillis();
        shop.getAnnotationPrice();
        System.out.println(System.currentTimeMillis()-lc);

    }
}
