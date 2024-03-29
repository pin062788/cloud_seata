package com.vivolvle.order_service.controller;

import com.vivolvle.order_service.config.AccountClient;
import com.vivolvle.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weilz
 * @date 2019/6/17
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private AccountClient accountClient;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/create")
    public String create(@RequestParam("userId") String userId, @RequestParam("commodityCode") String commodityCode
            , @RequestParam("count") Integer count, @RequestParam("onlyValue") String onlyValue) {
        Object result = redisTemplate.opsForHash().get(onlyValue, "order");
        if (null == result) {
            orderService.insert(userId, commodityCode, count, 20);
            redisTemplate.opsForHash().put(onlyValue, "order", "success");
        }
        accountClient.update(userId, 20, onlyValue);
        return "success";
    }
}
