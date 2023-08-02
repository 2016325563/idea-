package cn.kgc.controller;

import cn.kgc.entity.ClassRoom;
import cn.kgc.entity.Computer;
import cn.kgc.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerController {
    @Autowired
    ComputerService computerService;

    public void NumOfComputer() {

        List<Computer> computers = computerService.numOfCompWithClass();

        for (Computer computer : computers) {

            System.out.println(computer.getId() + "\t" + computer.getName() + "\t" + computer.getBlackComputerCount());

        }


    }

    public void delComputerById() {
        Integer row = computerService.delComputerById(28);
        System.out.println("删除的电脑有" + row);
    }


    public void modComputerPri() {

        Integer row = computerService.modComputerPri(100.0);
        System.out.println("改价的电脑有" + row);

    }


}
