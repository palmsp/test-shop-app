package org.palms.test.shop.app.service.handling;

import org.palms.test.shop.app.dto.Order;
import org.springframework.stereotype.Service;

@Service
public class BalanceHandler implements OrderHandler{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Check balance for customer id: " + order.getCustomerId());
        System.out.println("Total price is: " + order.getTotalPrice());
    }
}
