package com.leo.product_service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    private static final long serialVersionUID = 3609205504352843445L;
    private Integer id;
    private String name;
    private Integer price;
    private Integer store;
}
