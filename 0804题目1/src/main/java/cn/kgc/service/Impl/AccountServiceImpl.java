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

    public Integer updateAccountBalanceByName(String accountName, Integer price, Integer NowId) {

        Account account = selectAccountBalanceByName(accountName);
        if (account.getAccountBalance() < NowId) {
            throw new RuntimeException("账户的余额不足,"+"订单号码为" + NowId + "的订单异常,请重新处理");
        }

        Integer row = accountMapper.updateAccountBalanceByName(accountName, NowId);
        if (row > 0) {
            System.out.println("支付成功");
        }
        return row;
    }
}
