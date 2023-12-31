package cn.kgc.mapper;

import cn.kgc.entity.Animal;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @param
 * @author qwerty
 * @date 2023/8/30
 */
@Mapper
@Repository
public interface AnimalMapper extends BaseMapper<Animal> {


}
