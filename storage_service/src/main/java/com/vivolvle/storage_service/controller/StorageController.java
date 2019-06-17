package com.vivolvle.storage_service.controller;

import com.vivolvle.storage_service.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author weilz
 * @date 2019/6/17
 */
@RestController
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    private StorageService storageService;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/update")
    public String update(@RequestParam("commodityCode") String commodityCode
            , @RequestParam("count") Integer count, @RequestParam("onlyValue") String onlyValue) {
        Object result = redisTemplate.opsForHash().get(onlyValue, "storage");
        if (null == result) {
            storageService.update(commodityCode, count);
            redisTemplate.opsForHash().put(onlyValue, "storage", "success");
            redisTemplate.expire(onlyValue, 10, TimeUnit.MINUTES);
        }
        return "success";
    }
}
