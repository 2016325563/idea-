package cn.kgc.controller;

import cn.kgc.mapper.ComputerMapper;
import cn.kgc.service.ComputerService;
import cn.kgc.service.StockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ComputerController {

    @Autowired
    ComputerService computerService;
    @Autowired
    ComputerMapper computerMapper;


    public void selectComputerPriceById(Integer computerId) {

        computerMapper.selectComputerPriceById(computerId);

    }

}
