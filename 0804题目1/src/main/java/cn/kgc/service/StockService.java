package cn.kgc.service;

import cn.kgc.entity.Stock;
import org.springframework.stereotype.Component;

@Component
public interface StockService {


    /*
            <br>1.输入电脑id,查询库存量<br>
        */
    Stock selectStockQuantityById( Integer computerId);

    Integer updateStockQuantityById(Integer computerId, Integer NowId);

}
