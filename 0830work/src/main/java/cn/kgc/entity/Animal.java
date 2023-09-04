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
    private Integer id;
    private String name;
    private String gender;
    private String color;
    private Integer deleted;

    // 省略getter和setter方法
}