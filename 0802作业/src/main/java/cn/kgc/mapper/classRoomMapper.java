package cn.kgc.mapper;

import cn.kgc.entity.ClassRoom;
import cn.kgc.entity.Computer;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface classRoomMapper {

    /*插入一个教室*/
    Integer addClass(ClassRoom classRoom);

    /*选择名字可能的教室*/
    List<ClassRoom> alikeClassName(String alikeName);

    /*选择可能id包含的信息*/
    List<ClassRoom> getAllInfoById(Integer alikeNum);


}
