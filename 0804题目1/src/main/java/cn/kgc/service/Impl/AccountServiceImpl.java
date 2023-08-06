package cn.kgc.service.Impl;

import cn.kgc.entity.Account;
import cn.kgc.mapper.AccountMapper;
import cn.kgc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;


    public Account selectAccountBalanceByName(String accountName) {
        return accountMapper.selectAccountBalanceByName(accountName);
    }

    public Integer updateAccountBalanceByName(String accountName, Integer computerPrice) {

        Account account = selectAccountBalanceByName(accountName);
        if (account.getAccountBalance() < computerPrice) {
            throw new RuntimeException("账户的余额不足");
        }

        Integer row = accountMapper.updateAccountBalanceByName(accountName, computerPrice);
        if (row > 0) {
            System.out.println("支付成功");
        }
        return row;
    }
}
