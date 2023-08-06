package cn.kgc.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public interface buyComputerService {
    /*存账单的行为*/
    HashMap<String, Object> creatOrder(String accountName, Integer computerId);

    /*买电脑的行为*/
    public void buyComputer(String accountName, Integer computerId, Map map);
}
