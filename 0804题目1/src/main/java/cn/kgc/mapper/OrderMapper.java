package cn.kgc.mapper;

import cn.kgc.entity.Order;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderMapper {
    /*插入订单表格*/
   public Integer insOrder(Order order);
}
