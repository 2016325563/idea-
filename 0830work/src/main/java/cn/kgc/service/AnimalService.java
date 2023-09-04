package cn.kgc.service;

import cn.kgc.entity.Animal;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */

@Component

public interface AnimalService {


    List<Animal> selectList();

    void insert(Animal animal);

    void deleteById(int id);
}