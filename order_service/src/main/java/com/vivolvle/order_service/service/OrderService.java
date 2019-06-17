package com.vivolvle.order_service.service;

import com.vivolvle.order_service.entity.OrderTbl;

/**
 * @author weilz
 * @date 2019/6/17
 */
public interface OrderService {
    OrderTbl insert(String userId, String commodityCode, Integer count, Integer money);
}
