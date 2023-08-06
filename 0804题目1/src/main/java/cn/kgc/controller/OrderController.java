package cn.kgc.controller;

import cn.kgc.entity.Order;
import cn.kgc.service.OrderService;
import cn.kgc.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

@org.springframework.stereotype.Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    public void insOrder() {

//
//        Integer row = orderService.insOrder();
//        if (row < 0) {
//            System.out.println("订单导入失败");
//        }

    }

    public Integer orderMapper() {

        return orderService.getNewId();

    }

    public Integer upOrderStatus(Integer orderId) {
        return orderService.upOrderStatus(orderId);
    }
}