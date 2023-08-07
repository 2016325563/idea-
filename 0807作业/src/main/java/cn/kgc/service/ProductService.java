package cn.kgc.service;

import cn.kgc.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductService {
    /*获得所有的信息*/
    List<Product> getAllInfo();

    /*加入产品*/
    Integer addProduct(List<Product> products);

    /*删除产品*/
    Integer DelProById(Integer productId);

}
