package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //get set
@AllArgsConstructor //带所有参数的构造方法
@NoArgsConstructor //不带参数的构造方法
public class Order {

    Integer orderId;
    String orderTime;
    String orderPerson;
    Integer totalAmount;
    Integer orderStatus;
    String shippingStatus;


}
