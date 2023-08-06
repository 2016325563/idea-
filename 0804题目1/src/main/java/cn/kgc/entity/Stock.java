package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Stock {
    private Integer stockId;
    private Integer computerId;
    private Integer stockQuantity;
    // 省略 getter 和 setter
}