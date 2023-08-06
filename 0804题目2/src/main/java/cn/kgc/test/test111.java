package cn.kgc.test;

import cn.kgc.controller.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test111 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Controller controller = applicationContext.getBean("controller", Controller.class);
//
//
        controller.TransferAccounts();


//        Service service=applicationContext.getBean("service", Service.class);
//        service.getAccountById(1);

    }


}
