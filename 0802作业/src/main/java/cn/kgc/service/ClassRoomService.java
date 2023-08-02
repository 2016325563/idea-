package cn.kgc.service;

import cn.kgc.entity.ClassRoom;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ClassRoomService {
    /*插入一个教室*/
    Integer addClass(ClassRoom classRoom);

    /*选择名字可能的教室*/
    List<ClassRoom> alikeClassName(String alikeName);

    /*选择可能id包含的信息*/
    List<ClassRoom> getAllInfoById(Integer alikeNum);

}
