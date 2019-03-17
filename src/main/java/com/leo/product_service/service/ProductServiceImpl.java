package com.leo.product_service.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.leo.product_service.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer, Product> DAO_MAP = Maps.newHashMap();

    static {
        Product p1 = new Product(1,"Iphonex",9999,10);
        Product p2 = new Product(2,"冰箱",5342,19);
        Product p3 = new Product(3,"洗衣机",523,90);
        Product p4 = new Product(4,"电话",64345,150);
        Product p5 = new Product(5,"汽车",2345,140);
        Product p6 = new Product(6,"椅子",253,20);
        Product p7 = new Product(7,"java编程思想",2341,10);

        DAO_MAP.put(p1.getId(),p1);
        DAO_MAP.put(p2.getId(),p2);
        DAO_MAP.put(p3.getId(),p3);
        DAO_MAP.put(p4.getId(),p4);
        DAO_MAP.put(p5.getId(),p5);
        DAO_MAP.put(p6.getId(),p6);
        DAO_MAP.put(p7.getId(),p7);

    }

    @Override
    public List<Product> listProduct() {
        return Lists.newArrayList(DAO_MAP.values());
    }

    @Override
    public Product findById(Integer id) {
        return DAO_MAP.get(id);
    }
}
