package org.palms.test.shop.app.service.delivery;

import org.palms.test.shop.app.dto.Order;
import org.springframework.stereotype.Component;

@Component
public class SelfPickUp implements Delivery {

    @Override
    public void deliver(Order order) {
        System.out.println("It will be a self-pick-up");
    }

    @Override
    public String deliverType() {
        return DeliveryType.SELF_PICKUP.getCode();
    }
}
