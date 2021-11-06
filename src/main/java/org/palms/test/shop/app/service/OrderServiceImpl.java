package org.palms.test.shop.app.service;

import org.palms.test.shop.app.dto.Order;
import org.palms.test.shop.app.service.delivery.Delivery;
import org.palms.test.shop.app.service.handling.MainOrderHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private MainOrderHandler orderHandler;

    private Map<String, Delivery> deliveryMap = new HashMap<>();

    /*
    public OrderServiceImpl(List<Delivery> deliveries) {
        deliveryMap = deliveries.stream().collect(Collectors.toMap(Delivery::deliverType, d -> d));
    }
     */

    @Override
    public void processOrder(Order order) {
        System.out.println("Start process order: " + order.getOrderId());
        orderHandler.handleOrder(order);
        System.out.println("Finished process order");
    }

    @Override
    public void deliverOrder(Order order) {
        Delivery delivery = deliveryMap.getOrDefault(order.getDeliveryType(), null);
        delivery.deliver(order);
    }

    @Override
    public void register(String deliverType, Delivery delivery) {
        deliveryMap.put(deliverType, delivery);
    }
}
