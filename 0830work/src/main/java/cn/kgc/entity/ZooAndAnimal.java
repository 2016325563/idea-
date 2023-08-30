package cn.kgc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("zoo_animal")



public class ZooAndAnimal {
    Integer zooId;
    Integer animalId;
}
