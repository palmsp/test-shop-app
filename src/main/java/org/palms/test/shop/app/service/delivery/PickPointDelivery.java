package org.palms.test.shop.app.service.delivery;

import org.palms.test.shop.app.dto.Order;
import org.springframework.stereotype.Component;

@Component
public class PickPointDelivery implements Delivery {

    @Override
    public void deliver(Order order) {
        System.out.println("Deliver to PickPoint");
    }

    @Override
    public String deliverType() {
        return DeliveryType.PICK_POINT.getCode();
    }
}
