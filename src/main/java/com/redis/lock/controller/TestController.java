package com.redis.lock.controller;

import com.redis.lock.annotation.RedisLock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RedisLock(key = "redis_lock")
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
