package com.vivolvle.order_service.repositories;

import com.vivolvle.order_service.entity.OrderTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author weilz
 * @date 2019/6/17
 */
@Component
public interface OrderRepository extends JpaRepository<OrderTbl, Object> {
}
