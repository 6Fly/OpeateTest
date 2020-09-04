package com.cfam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * 异步调用方法
 * @author
 */
@Service
@Slf4j
public class Shop {


    private Random random = new Random();


    public void  getPrice(){
        log.info("非异步");
         calculator();
        log.info("非异步 结束");

    }

    public Future<Double> getAsyncPrice(){
        log.info("Future 异步");
        CompletableFuture<Double> future = new CompletableFuture();
        new Thread(()->{
            double price = calculator();
            log.info("Future 异步结束");
            future.complete(price);
        }).start();
        return future;
    }
    @Async
    public void getAnnotationPrice(){
        log.info("Spring 注解");
        calculator();
        log.info("Spring 注解结束");
    }


    private double calculator(){
        read();
        return random.nextDouble();
    }

    private void read(){
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
