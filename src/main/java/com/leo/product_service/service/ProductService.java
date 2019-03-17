package com.leo.product_service.service;

import com.leo.product_service.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();
    Product findById(Integer id);
}
