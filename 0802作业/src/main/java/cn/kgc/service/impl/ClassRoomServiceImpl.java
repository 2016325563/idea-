package cn.kgc.service.impl;

import cn.kgc.entity.ClassRoom;
import cn.kgc.mapper.classRoomMapper;
import cn.kgc.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Autowired
    classRoomMapper classroomMapper;

    public Integer addClass(ClassRoom classRoom) {
        return classroomMapper.addClass(classRoom);
    }

    public List<ClassRoom> alikeClassName(String alikeName) {
        return classroomMapper.alikeClassName(alikeName);
    }

    public List<ClassRoom> getAllInfoById(Integer alikeNum) {
        return classroomMapper.getAllInfoById(alikeNum);
    }
}
