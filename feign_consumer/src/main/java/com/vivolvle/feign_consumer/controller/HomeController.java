package com.vivolvle.feign_consumer.controller;

import com.vivolvle.feign_consumer.config.OrderClient;
import com.vivolvle.feign_consumer.config.StorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author weilz
 * @date 2019/6/17
 */
@RestController
public class HomeController {
    @Autowired
    private StorageClient storageClient;
    @Autowired
    private OrderClient orderClient;

    @GetMapping("/feign")
    public String feign(@RequestParam("userId") String userId,
                        @RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count) {
        //生成唯一键
        String onlyValue = userId + "," + commodityCode + "," + count + new Date().getTime();
        storageClient.update(commodityCode, count, onlyValue);
        orderClient.create(userId, commodityCode, count, onlyValue);
        return "success";
    }
}
