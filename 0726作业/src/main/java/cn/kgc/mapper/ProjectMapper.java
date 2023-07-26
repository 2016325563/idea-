package cn.kgc.mapper;

import cn.kgc.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
    public List<Project> getAllProject(@Param("projName") String projName);
}