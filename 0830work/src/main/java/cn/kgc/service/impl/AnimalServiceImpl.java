package cn.kgc.service.impl;

import cn.kgc.entity.Animal;
import cn.kgc.mapper.AnimalMapper;
import cn.kgc.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalMapper animalMapper;

    @Override
    public List<Animal> selectList() {
        return animalMapper.selectList(null);
    }

    @Override
    public void insert(Animal animal) {
        animalMapper.insert(animal);
    }

    @Override
    public void deleteById(int id) {
        animalMapper.deleteById(id);
    }
}
