package com.cfam.config;

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

    @Around("syncLockOperate()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Map map = (Map) args[0];
        String key = map.get("ppp").toString();
        Boolean ty = redisService.addRedisLock(key, key);
        if (ty){
            try {
                return  joinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                throw new BusinessException(204,"异常操作");
            } finally {
                redisService.removeLock(key,key);
            }
        }else {
            System.out.println("bing===============");
            throw new BusinessException(204,"重复提交");
        }
    }

}
