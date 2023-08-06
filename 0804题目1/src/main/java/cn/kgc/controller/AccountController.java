package cn.kgc.controller;

import cn.kgc.service.AccountService;
import cn.kgc.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    public void selectAccountBalanceByName(String accountName) {
        accountService.selectAccountBalanceByName(accountName);

    }

    public void updateAccountBalanceByName(String accountName, Integer computerPrice) {

        accountService.updateAccountBalanceByName(accountName, computerPrice);
    }

}