package cn.kgc.service;

import cn.kgc.entity.Account;
import cn.kgc.entity.Order;
import org.springframework.stereotype.Component;

@Component
public interface OrderService {

    /*插入订单表格*/
    public Integer insOrder(Order order);

}
