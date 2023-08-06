import cn.kgc.controller.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class test0804work {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComputerController computerController = applicationContext.getBean("computerController", ComputerController.class);
        AccountController accountController = applicationContext.getBean("accountController", AccountController.class);

        OrderController orderController = applicationContext.getBean("orderController", OrderController.class);

        StockController stockController = applicationContext.getBean("stockController", StockController.class);
        buyComputerController buyComputerController = applicationContext.getBean("buyComputerController", buyComputerController.class);


        //computerController.selectComputerPriceById(1);
        //stockController.updateStockQuantityById(1);
        //stockController.selectStockQuantityById(1);
        //accountController.selectAccountBalanceByName("UserA");
        //accountController.updateAccountBalanceByName("UserA");

        Map OrderInfo = buyComputerController.creatOrder("UserA", 1);
        buyComputerController.buyComputer("UserA", 1, OrderInfo);


    }
}
