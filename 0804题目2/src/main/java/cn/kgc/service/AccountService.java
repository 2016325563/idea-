package cn.kgc.service;

import cn.kgc.entity.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AccountService {

    /*转账*/
    Integer TransferAccounts(Integer Balance, Integer accountId);

    Account getAccountById(Integer accountId);

}
