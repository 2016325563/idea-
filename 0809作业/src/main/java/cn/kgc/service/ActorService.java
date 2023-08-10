package cn.kgc.service;

import cn.kgc.entity.Actor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ActorService {

//    <br>1.2完成新增一个演员

    Integer addActor(Actor actor);
//    <br>1.3查询所有+根据代表作模糊查询

    List<Actor> getAllActorOrAlike(@Param("representativeWorks") String representativeWorks);
//    <br>1.4根据id删除

    Integer delById(@Param("actorId") Integer actorId);
}
