package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Integer customerId;
    private String customerName;
    private String customerPassword;
    private String customerAddress;
    private String customerPhone;


}
