package org.palms.test.shop.app.service.handling;

import org.palms.test.shop.app.dto.Order;
import org.springframework.stereotype.Service;

@Service
public class QuantityHandler implements OrderHandler{

    @Override
    public void handleOrder(Order order) {
        order.getGoods().forEach(good -> {
            System.out.println("Check quantity for " + good.getName() + ": " + good.getQuantity());
        });
    }
}
