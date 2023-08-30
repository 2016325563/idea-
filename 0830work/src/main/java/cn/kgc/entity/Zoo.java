package cn.kgc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
// 实体类
public class Zoo {
    @TableId(type = IdType.AUTO)//自动增那个的
    private int id;
    private String name;
    private String address;
    private String phone;
    // 省略getter和setter方法s
}