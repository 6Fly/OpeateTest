package com.cfam.config;

import com.cfam.annotation.Synclock;
import com.cfam.base.exception.BusinessException;
import com.cfam.redis.RedisService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author L
 */
@Aspect
@Component
public class SynclockConfig {
    @Autowired
    private RedisService redisService;

    @Pointcut("@annotation(com.cfam.annotation.Synclock)")
    public void syncLockOperate(){};

    @Around("syncLockOperate() && @annotation(synclock)")
    public Object doAround(ProceedingJoinPoint joinPoint, Synclock synclock) throws Throwable {
        String annKey = synclock.key();
        Object[] args = joinPoint.getArgs();
        Map map = (Map) args[0];
        String key = map.get("ppp").toString();
        Boolean ty = redisService.addRedisLock(key, key);
        if (ty){
            try {
                return  joinPoint.proceed();
            } finally {
                redisService.removeLock(key,key);
            }
        }
        System.out.println("bing===============");
        throw new BusinessException(204,"重复提交");

    }
}
