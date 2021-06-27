package org.kevin.controller;

import org.kevin.repository.MyRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin.Z
 * @version 2021/6/27
 */
@RestController
public class RedisController {
    @Autowired
    private MyRedisRepository redisRepository;

    @GetMapping("/redis/set")
    public String redisSet(@RequestParam("key") String key,
                           @RequestParam("value") String value){
        redisRepository.set(key, value);
        return "done";
    }

    @GetMapping("/redis/get")
    public String redisGet(@RequestParam("key") String key){
        return redisRepository.get(key);
    }

    // for set
    @GetMapping("/redis/sSet")
    public String redisSSet(@RequestParam("key") String key,
                            @RequestParam("value") String value){
        redisRepository.sSet(key, value + "1", value + "2", value + "3");
        return "done";
    }

    @GetMapping("/redis/sExist")
    public boolean redisSExist(@RequestParam("key") String key,
                               @RequestParam("value") String value){
        return redisRepository.sIsMember(key, value);
    }

    @GetMapping("/redis/sGet")
    public String redisSGet(@RequestParam("key") String key){
        return redisRepository.sGetAll(key).toString();
    }
}
