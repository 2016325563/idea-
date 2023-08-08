package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    // 定义老师的属性
    private Integer id; // 老师id
    private String name; // 老师名称
    private Integer age; // 年龄
    private String phone; // 电话
    private String address; // 地址

}
