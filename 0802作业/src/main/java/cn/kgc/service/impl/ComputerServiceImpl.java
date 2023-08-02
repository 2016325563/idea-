package cn.kgc.service.impl;

import cn.kgc.entity.ClassRoom;
import cn.kgc.entity.Computer;
import cn.kgc.mapper.computerMapper;
import cn.kgc.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService {
    @Autowired
    private computerMapper computerMapper;


    public Integer modComputerPri(Double alikePrice) {
        return computerMapper.modComputerPri(alikePrice);
    }

    public List<Computer> numOfCompWithClass() {
        return computerMapper.numOfCompWithClass();
    }

    public Integer delComputerById(Integer alikeNum) {
        return computerMapper.delComputerById(alikeNum);
    }
}
