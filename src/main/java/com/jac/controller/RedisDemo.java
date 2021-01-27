package com.jac.controller;

import com.jac.domain.RedisPOJO;
import com.jac.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：jacketzc
 * Created in 2021/1/27 20:55
 */
@RestController
@RequestMapping("/redis")
public class RedisDemo {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @PostMapping()
    public void putDemo(@RequestParam String key,@RequestParam String value) {
        redisUtils.set(key, value);

//        redisTemplate.opsForValue().set(key,value);

    }

    @GetMapping("/{key}")
    public Object getDemo(@PathVariable String key) {
        return redisTemplate.opsForValue().get(key);
    }

}
