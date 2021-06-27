package org.kevin.repository;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Kevin.Z
 * @version 2021/6/27
 */
@Repository
public class MyRedisRepository {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    // 10 minutes
    private static Integer DEFAULT_EXPIRATION = 60 * 10;

    // operation for String
    public void set(String key, String value){
        this.setWithExpireTime(key, value, DEFAULT_EXPIRATION);
    }

    public void setWithExpireTime(String key, Object value, int expireSeconds){
        redisTemplate.opsForValue().set(key, value, expireSeconds, TimeUnit.SECONDS);
    }

    public <T> T get(String key){
        return (T)redisTemplate.opsForValue().get(key);
    }

    // operation for Set<E>
    public Long sSet(String key, Object... value){
        return redisTemplate.opsForSet().add(key, value);
    }

    public boolean sIsMember(String key, Object value){
        return redisTemplate.opsForSet().isMember(key, value);
    }

    public <T> Set<T> sGetAll(String key){
        return (Set<T>)redisTemplate.opsForSet().members(key);
    }
}
