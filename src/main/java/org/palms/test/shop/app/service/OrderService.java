package org.palms.test.shop.app.service;

import org.palms.test.shop.app.dto.Order;
import org.palms.test.shop.app.service.delivery.Delivery;

public interface OrderService {

    void processOrder(Order order);

    void deliverOrder(Order order);

    void register(String deliverType, Delivery delivery);
}
