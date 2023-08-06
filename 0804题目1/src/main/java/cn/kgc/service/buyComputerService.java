package cn.kgc.service;

import org.springframework.stereotype.Component;

@Component
public interface buyComputerService {
    /*买电脑的行为*/
    public void buyComputer(String accountName, Integer computerId);

}
