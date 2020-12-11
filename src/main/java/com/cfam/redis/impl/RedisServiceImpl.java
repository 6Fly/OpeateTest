package com.cfam.redis.impl;

import com.cfam.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author L
 */
@Service
public class RedisServiceImpl implements RedisService {
    private static final Integer LOCK_TIME = 30;
    @Autowired
    private RedisTemplate<Object,Object>  redisTemplate;

    @Override
    public Boolean addRedisLock(String key,String value) {
        return redisTemplate.opsForValue().setIfAbsent(key,value,LOCK_TIME, TimeUnit.SECONDS);
    }

    @Override
    public void removeLock(String key,String value) {
        Boolean delete = redisTemplate.delete(key);
        System.out.println(delete);
    }
}
