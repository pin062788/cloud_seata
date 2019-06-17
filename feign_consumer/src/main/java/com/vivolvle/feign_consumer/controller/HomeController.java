package com.vivolvle.feign_consumer.controller;

import com.vivolvle.feign_consumer.config.OrderClient;
import com.vivolvle.feign_consumer.config.StorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        storageClient.update(commodityCode, count);
        orderClient.create(userId, commodityCode, count);
        return "success";
    }
}
