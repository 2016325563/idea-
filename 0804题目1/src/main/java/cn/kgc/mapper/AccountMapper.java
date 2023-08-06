package cn.kgc.mapper;

import cn.kgc.entity.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {

    /*
    //    <br>1.根据输入的账号名称，查询余额<br>
    */
    Account selectAccountBalanceByName(@Param("accountName") String accountName);

    /*更改账户的余额*/
    Integer updateAccountBalanceByName(@Param("accountName") String accountName, @Param("computerPrice") Integer computerPrice);

}
