package com.demo.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.aop.dao.AccountsDAO;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountsDAO accountsDAO)
	{
		return Runnable->{
			demobeforeAdvice(accountsDAO);
		};
	}

	private void demobeforeAdvice(AccountsDAO accountsDAO) {
		// TODO Auto-generated method stub
		Account myAccount = new Account();
		accountsDAO.addAccount(myAccount);
		accountsDAO.addAccount();
		int a=accountsDAO.addAccountName(myAccount,2);
	}

}
