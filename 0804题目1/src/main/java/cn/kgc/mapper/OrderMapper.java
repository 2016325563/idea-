package cn.kgc.mapper;

import cn.kgc.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderMapper {
    /*插入订单表格*/
    public Integer insOrder(Order order);

    /*获取最新的订单号码*/
    Integer getNewId();

    /*更新账单的信息*/
    Integer upOrderStatus(@Param("orderId") Integer orderId);
}
