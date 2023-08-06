package cn.kgc.service.Impl;

import cn.kgc.entity.Account;
import cn.kgc.entity.Order;
import cn.kgc.mapper.AccountMapper;
import cn.kgc.mapper.OrderMapper;
import cn.kgc.service.AccountService;
import cn.kgc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;


    public Integer insOrder(Order order) {


        Integer row = orderMapper.insOrder(order);
        if (row > 0) {

            System.out.println("订单生成成功");
        }
        return row;
    }

    public Integer getNewId() {
        return orderMapper.getNewId();
    }

    public Integer upOrderStatus(Integer orderId) {
        return orderMapper.upOrderStatus(orderId);
    }


}
