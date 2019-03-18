package com.leo.product_service.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.leo.product_service.pojo.Product;
import com.leo.product_service.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public Object list() {
        return productService.listProduct();
    }

    @GetMapping("find")
    public Object findById(@RequestParam("id") int id) {
        Product product = productService.findById(id);
        Product result = new Product();
        BeanUtils.copyProperties(product, result);
        result.setName(product.getName() + " data from port=" + port);
        return result;
    }
}
