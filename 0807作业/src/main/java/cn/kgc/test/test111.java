package cn.kgc.test;

import cn.kgc.controller.ProductController;
import cn.kgc.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class test111 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductController productController = applicationContext.getBean("productController", ProductController.class);
//
//

       // productController.getAllInfo();
        Product product1 = new Product(null, 1000, "加入的1", "描述的1",1);
        Product product2 = new Product(null, 1000, "加入的1", "描述的1",2);

        Product product3 = new Product(null, 1000, "加入的1", "描述的1",1);

        List<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        //productController.addProduct(products);
        productController.DelProById(7);
//        Service service=applicationContext.getBean("service", Service.class);
//        service.getAccountById(1);

    }


}
