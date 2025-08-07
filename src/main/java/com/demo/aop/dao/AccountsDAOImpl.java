package com.demo.aop.dao;

import org.springframework.stereotype.Repository;

import com.demo.aop.Account;

@Repository
public class AccountsDAOImpl implements AccountsDAO{
    @Override
    public void addAccount()
    {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public int addAccountName(Account myAccount,int a) {
        // TODO Auto-generated method stub
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT Name Ranjan B");
        return 0;
    }

    @Override
    public void addAccount(Account myAccount) {
        // TODO Auto-generated method stub
        System.out.println("adding account with parameter");
    }
}
