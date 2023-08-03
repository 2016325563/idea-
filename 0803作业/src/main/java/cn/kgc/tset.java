package cn.kgc;

import cn.kgc.controller.OrderController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tset {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderController orderController = applicationContext.getBean("orderController", OrderController.class);
        //orderController.addOrder();
        // orderController.updOrder();
        // orderController.getAllOrder();
        orderController.delOrderById();
    }


}


