package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    private Integer orderId;
    private String orderTime;
    private Integer computerId;
    private Integer orderQuantity;
    private Integer orderTotalPrice;
    private Integer paymentStatus;
    private String shippingStatus;
    // 省略 getter 和 setter
}