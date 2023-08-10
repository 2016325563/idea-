package cn.kgc.service.impl;

import cn.kgc.controller.ActorController;
import cn.kgc.entity.Actor;

import cn.kgc.mapper.ActorMapper;
import cn.kgc.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    ActorMapper actorMapper;


    @Override
    public Integer addActor(Actor actor) {
        return actorMapper.addActor(actor);
    }

    @Override
    public List<Actor> getAllActorOrAlike(String representativeWorks) {
        return actorMapper.getAllActorOrAlike(representativeWorks);
    }

    @Override
    public Integer delById(Integer actorId) {
        return actorMapper.delById(actorId);
    }

}
