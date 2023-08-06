package cn.kgc.service.Impl;

import cn.kgc.service.AccountService;
import cn.kgc.service.TransferAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferAccountImpl implements TransferAccount {

    @Autowired
    AccountService accountService;

    public void TransferAccounts() {
        Integer Balance = 100;

        accountService.TransferAccounts(-Balance, 1);
        accountService.TransferAccounts(Balance, 2);
    }
}
