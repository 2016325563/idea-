package cn.kgc.controller;

import cn.kgc.service.buyComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class buyComputerController {

    @Autowired
    buyComputerService buyComputerService;

    public void buyComputer(String accountName, Integer computerId) {
        buyComputerService.buyComputer(accountName, computerId);
    }

}
