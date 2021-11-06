package org.palms.test.shop.app.dto;

import lombok.Data;

import java.util.List;

@Data
public class Order {

    private Long orderId;
    private Long customerId;
    private List<Good> goods;
    private Double totalPrice;
    private String deliveryType;
}
