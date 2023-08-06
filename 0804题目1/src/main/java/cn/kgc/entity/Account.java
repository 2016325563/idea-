package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Account {
    private Integer accountId;
    private String accountName;
    private Integer accountBalance;
    // 省略 getter 和 setter
}