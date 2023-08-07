package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Java类，对应商品表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer productId;
    private Integer productPrice;
    private String productName;
    private String productDescription;
    private Integer supplierId;

    // private Supplier supplier;

// 构造方法，getters和setters省略
}