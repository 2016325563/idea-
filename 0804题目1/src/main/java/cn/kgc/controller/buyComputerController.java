package cn.kgc.controller;

import cn.kgc.service.buyComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class buyComputerController {

    @Autowired
    buyComputerService buyComputerService;

    /*存账单的行为*/
    public Map creatOrder(String accountName, Integer computerId) {

        return buyComputerService.creatOrder(accountName, computerId);

    }

    public void buyComputer(String accountName, Integer computerId, Map map) {
        buyComputerService.buyComputer(accountName, computerId, map);
    }

}
