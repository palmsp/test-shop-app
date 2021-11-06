package org.palms.test.shop.app;

import org.junit.jupiter.api.Test;
import org.palms.test.shop.app.service.delivery.DeliveryType;
import org.palms.test.shop.app.dto.Good;
import org.palms.test.shop.app.dto.Order;
import org.palms.test.shop.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class TestShopAppApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
    }

    @Test
    void handleOrderTest(){
        final Order order = new Order();
        order.setOrderId(104566L);
        order.setCustomerId(100022l);
        order.setDeliveryType(DeliveryType.EXPRESS_DELIVERY.getCode());
        order.setTotalPrice(350.00);
        final List<Good> goods = new ArrayList<>();
        final Good toy = new Good("Duck-toy", 1L, 350.00);
        goods.add(toy);
        order.setGoods(goods);
        
        orderService.processOrder(order);
        orderService.deliverOrder(order);
    }
}
