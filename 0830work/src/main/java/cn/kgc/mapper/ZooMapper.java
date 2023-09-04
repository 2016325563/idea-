package cn.kgc.mapper;

import cn.kgc.entity.Animal;
import cn.kgc.entity.Zoo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */
@Mapper
@Repository

public interface ZooMapper extends BaseMapper<Zoo> {

    /*查询关联的表格*/
    List<Zoo> ZooWithAnimal();
}
