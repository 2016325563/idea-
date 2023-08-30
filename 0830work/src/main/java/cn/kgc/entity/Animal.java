package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private int id;
    private String name;
    private String gender;
    private String color;
    // 省略getter和setter方法
}