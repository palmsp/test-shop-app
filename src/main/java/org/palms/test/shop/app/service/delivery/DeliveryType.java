package org.palms.test.shop.app.service.delivery;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeliveryType {

    SELF_PICKUP("selfPickUp"), EXPRESS_DELIVERY("expressDelivery"), PICK_POINT("pickPoint");

    String code;
}
