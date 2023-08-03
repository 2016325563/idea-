package cn.kgc.service.impl;

import cn.kgc.entity.Order;
import cn.kgc.mapper.OrderMapper;
import cn.kgc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    public Integer addOrder(Order order) {
        return orderMapper.addOrder(order);
    }

    public Integer updOrder(Order order) {
        return orderMapper.updOrder(order);
    }

    public List<Order> getAllOrder() {
        return orderMapper.getAllOrder();
    }

    public Integer delOrderById(Integer orderId) {
        return orderMapper.delOrderById(orderId);
    }
}

