package cn.kgc.service;

import cn.kgc.entity.ClassRoom;
import cn.kgc.entity.Computer;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ComputerService {


    /*todo 给电脑涨价*/
    Integer modComputerPri(Double alikePrice);

    /*黑色电脑的数量*/
    List<Computer> numOfCompWithClass();

    /*根据id删除的电脑*/
    Integer delComputerById(Integer alikeNum);


}
