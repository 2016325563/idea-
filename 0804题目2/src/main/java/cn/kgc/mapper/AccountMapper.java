package cn.kgc.mapper;

import cn.kgc.entity.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
    /*转账*/
    Integer TransferAccounts(@Param("Balance") Integer Balance, @Param("accountId") Integer accountId);

    Account getAccountById(@Param("accountId") Integer accountId);

    Account getAccountById1();

}
