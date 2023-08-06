package cn.kgc.mapper;

import cn.kgc.entity.Stock;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface StockMapper {
    /*
        <br>1.输入电脑id,查询库存量<br>
    */
    Stock selectStockQuantityById(@Param("computerId") Integer computerId);

    /*库存减少的*/

    Integer updateStockQuantityById(@Param("computerId") Integer computerId);
}
