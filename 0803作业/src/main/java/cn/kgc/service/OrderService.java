package cn.kgc.service;

import cn.kgc.entity.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderService {

    Integer addOrder(Order order);

    Integer updOrder(Order order);

    List<Order> getAllOrder();

    Integer delOrderById(Integer orderId);


}
