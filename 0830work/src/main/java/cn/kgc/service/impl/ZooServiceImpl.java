package cn.kgc.service.impl;

import cn.kgc.entity.Zoo;
import cn.kgc.mapper.ZooMapper;
import cn.kgc.service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */
@Service
public class ZooServiceImpl implements ZooService {
    @Autowired
    private ZooMapper zooMapper;

    @Override
    public List<Zoo> getAllZoos() {
        return zooMapper.selectList(null);
    }


    @Override
    public void updateZoo(Zoo zoo) {
        zooMapper.updateById(zoo);
    }

    @Override
    public List<Zoo> ZooWithAnimal() {
        return zooMapper.ZooWithAnimal();
    }
}