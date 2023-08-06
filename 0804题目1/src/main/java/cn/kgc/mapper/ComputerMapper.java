package cn.kgc.mapper;

import cn.kgc.entity.Computer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerMapper {

    /*<br>1.根据输入电脑id,查询电脑价格<br>*/
    Computer selectComputerPriceById(@Param("computerId") Integer computerId);
}
