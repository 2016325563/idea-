package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Computer {
    private Integer computerId;
    private String computerColor;
    private Integer computerPrice;
    private Integer computerSize;
    // 省略 getter 和 setter
}