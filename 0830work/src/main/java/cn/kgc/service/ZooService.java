package cn.kgc.service;

import cn.kgc.entity.Zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */
@Component
public interface ZooService {


    List<Zoo> getAllZoos();

    void updateZoo(Zoo zoo);

    List<Zoo> ZooWithAnimal();

}