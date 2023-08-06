package cn.kgc.service;

import cn.kgc.entity.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AccountService {


    /*
      //    <br>1.根据输入的账号名称，查询余额<br>
      */
    Account selectAccountBalanceByName(String accountName);


    /*更改账户的余额*/
    Integer updateAccountBalanceByName(String accountName, Integer computerPrice);

}
