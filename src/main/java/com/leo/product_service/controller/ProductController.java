package com.leo.product_service.controller;

import com.leo.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public Object list() {
        return productService.listProduct();
    }

    @GetMapping("find")
    public Object findById(@RequestParam("id") int id) {
        return productService.findById(id);
    }
}
