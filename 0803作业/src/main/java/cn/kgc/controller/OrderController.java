package cn.kgc.controller;

import cn.kgc.entity.Order;
import cn.kgc.service.OrderService;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller

public class OrderController {

    @Autowired
    OrderService orderService;


    public Integer addOrder() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        /*设置时间个体类*/
        return orderService.addOrder(new Order(null, format, "测试", 100, 1, "测试"));


    }

    public Integer updOrder() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        return orderService.updOrder(new Order(13, format, "修改之后的", 100, 1, "修改之后的"));

    }

    public List<Order> getAllOrder() {

        return orderService.getAllOrder();


    }

    public Integer delOrderById() {

        return orderService.delOrderById(13);

    }

}
