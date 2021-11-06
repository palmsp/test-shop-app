package org.palms.test.shop.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Good {
    private String name;
    private Long quantity;
    private Double price;
}
