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


    public Integer TransferAccounts(Integer Balance, Integer accountId) {
        Account account = getAccountById(accountId);
        if (account.getAccountBalance() < Balance) {

            throw new RuntimeException(accountId + "的账户的余额不足");
        }
        return accountMapper.TransferAccounts(Balance, accountId);
    }

    public Account getAccountById(Integer accountId) {
        return accountMapper.getAccountById(accountId);
    }
}
