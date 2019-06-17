package com.vivolvle.feign_consumer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author weilz
 * @date 2019/6/17
 */
@FeignClient(name = "order-service")
public interface OrderClient {
    @GetMapping("/order/create")
    String create(@RequestParam("userId") String userId
            , @RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);
}
