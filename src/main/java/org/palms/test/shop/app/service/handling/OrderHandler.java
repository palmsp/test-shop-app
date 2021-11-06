package org.palms.test.shop.app.service.handling;

import org.palms.test.shop.app.dto.Order;

public interface OrderHandler {

    void handleOrder(Order order);
}
