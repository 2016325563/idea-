package cn.kgc;

import cn.kgc.controller.ClassRoomController;
import cn.kgc.controller.ComputerController;
import cn.kgc.service.ClassRoomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {


    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        ClassRoomController classRoomController = applicationContext.getBean("classRoomController", ClassRoomController.class);

        ComputerController computerController = applicationContext.getBean("computerController", ComputerController.class);


        //classRoomController.addClass();
        //classRoomController.alikeClassName();
         classRoomController.getAllInfoById();

        //computerController.NumOfComputer();
        //computerController.delComputerById();
       // computerController.modComputerPri();
    }


}
