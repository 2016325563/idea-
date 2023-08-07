package cn.kgc.service.Impl;

import cn.kgc.entity.Product;
import cn.kgc.mapper.ProductMapper;
import cn.kgc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    ProductMapper productMapper;
    public List<Product> getAllInfo() {
        return productMapper.getAllInfo();
    }

    public Integer addProduct(List<Product> products) {
        return productMapper.addProduct(products);
    }

    public Integer DelProById(Integer productId) {
        return productMapper.DelProById(productId);
    }
}
