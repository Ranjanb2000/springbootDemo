package com.demo.aop.dao;

import com.demo.aop.Account;

public interface AccountsDAO {
    
    void addAccount();

    int addAccountName(Account myAccount,int a);

    void addAccount(Account myAccount);
}
