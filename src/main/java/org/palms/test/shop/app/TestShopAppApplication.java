package org.palms.test.shop.app;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.palms.test.shop.app.dto.Good;
import org.palms.test.shop.app.dto.Order;
import org.palms.test.shop.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestShopAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestShopAppApplication.class, args);
    }

}
