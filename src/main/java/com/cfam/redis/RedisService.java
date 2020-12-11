package com.cfam.redis;

/**
 * @author L
 */
public interface RedisService {
    /**
     * 添加redis锁
     * @param key key
     * @param value
     * @return
     */
    Boolean addRedisLock(String key,String value);

    /**
     * 移除redis 锁
     * @param key key
     * @param value
     */
    void removeLock(String key,String value);
}
