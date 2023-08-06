package cn.kgc.controller;

import cn.kgc.service.AccountService;
import cn.kgc.service.TransferAccount;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    TransferAccount transferAccount;

    public void TransferAccounts() {

        transferAccount.TransferAccounts();

    }

}
