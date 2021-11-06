package org.palms.test.shop.app.service.delivery;

import org.palms.test.shop.app.dto.Order;
import org.springframework.stereotype.Component;

@Component
public class ExpressDelivery implements Delivery {
    @Override
    public void deliver(Order order) {
        System.out.println("Deliver by Express delivery");
    }

    @Override
    public String deliverType() {
        return DeliveryType.EXPRESS_DELIVERY.getCode();
    }
}
