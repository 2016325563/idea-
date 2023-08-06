package cn.kgc.service.Impl;

import cn.kgc.entity.Account;
import cn.kgc.entity.Computer;
import cn.kgc.mapper.AccountMapper;
import cn.kgc.mapper.ComputerMapper;
import cn.kgc.service.AccountService;
import cn.kgc.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerServiceImpl implements ComputerService {
    @Autowired
    ComputerMapper computerMapper;



    public Computer selectComputerPriceById(Integer computerId) {
        return computerMapper.selectComputerPriceById(computerId);
    }
}
