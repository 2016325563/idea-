package cn.kgc.mapper;

import cn.kgc.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    Integer addOrder(Order order);

    Integer updOrder(Order order);

    List<Order> getAllOrder();

    Integer delOrderById(Integer orderId);


}
