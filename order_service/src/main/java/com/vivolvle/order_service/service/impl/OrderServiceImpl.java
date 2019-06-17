package com.vivolvle.order_service.service.impl;

import com.vivolvle.order_service.entity.OrderTbl;
import com.vivolvle.order_service.repositories.OrderRepository;
import com.vivolvle.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weilz
 * @date 2019/6/17
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public OrderTbl insert(String userId, String commodityCode, Integer count, Integer money) {
        OrderTbl orderTbl = new OrderTbl();
        orderTbl.setUserId(userId);
        orderTbl.setCommodityCode(commodityCode);
        orderTbl.setCount(count);
        orderTbl.setMoney(money);
        orderRepository.save(orderTbl);
        return orderTbl;
    }
}
