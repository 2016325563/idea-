package cn.kgc.entity;
// Java类，对应供应商表


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    private int supplierId;
    private String supplierName;
    private String supplierPhone;
    private String supplierAddress;
    private List<Product> productList;

// 构造方法，getters和setters省略
}