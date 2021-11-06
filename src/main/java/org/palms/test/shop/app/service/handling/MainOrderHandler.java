package org.palms.test.shop.app.service.handling;

import org.palms.test.shop.app.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainOrderHandler {

    @Autowired
    private List<OrderHandler> handlers;

    public void handleOrder(Order order) {
        handlers.forEach(handler -> handler.handleOrder(order));
    }
}
