package com.cfam.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class AsyncConfig implements AsyncConfigurer {
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler(){
        return new SimpleAsyncUncaughtExceptionHandler();
    }
    static class SimpleAsyncUncaughtExceptionHandler implements AsyncUncaughtExceptionHandler{
        protected Logger logger = LoggerFactory.getLogger(AsyncConfig.class);

        @Override
        public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
            //判断异常 进行处理
            logger.error("异步异常");

        }
    }
}
