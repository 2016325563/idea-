package cn.kgc.service;

import cn.kgc.entity.Account;
import cn.kgc.entity.Computer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ComputerService {

    /*<br>1.根据输入电脑id,查询电脑价格<br>*/
    Computer selectComputerPriceById( Integer computerId);


}
