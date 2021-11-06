package org.palms.test.shop.app.service.delivery;

import org.palms.test.shop.app.dto.Order;
import org.palms.test.shop.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public interface Delivery {

    void deliver(Order order);

    String deliverType();

    @Autowired
    default void regMe(OrderService orderService){
        orderService.register(deliverType(), this);
    }
}
