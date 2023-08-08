package cn.kgc.controller;

import cn.kgc.entity.Product;
import cn.kgc.mapper.ProductMapper;
import cn.kgc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Controller
public class ProductController {


    @Autowired
    ProductService productService;

    public List<Product> getAllInfo() {

        return productService.getAllInfo();
    }

    public Integer addProduct(List<Product> products) {
        return productService.addProduct(products);
    }

    public Integer DelProById(Integer productId) {
        return productService.DelProById(productId);
    }
}
