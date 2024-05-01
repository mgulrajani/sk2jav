package com.training.day4.services;

import com.training.day4.entities.Account;
import com.training.day4.entities.CheckingAccount;
import com.training.day4.entities.SavingAccount;

//prior to 1.8 all the methods in interfaces were abstract 
//100% abstraction
//default methods and static methods in the interfaces , 
//transferFundsToAnotherAccount , as it is going to have same logic in all the implementation class ,
//we are using the DRY  principle --Do Not Repeat Yourself
public interface BankingServices {

	//we will declare the methods
	
	//deposit withdrawl transfer of funds from 1 acct to another
	//methods are by default abstract in an interface ,unless you specify them as static or default in which case your interface will have its implementation
	public void deposit(double amtToBeDeposited);
	
	public void withdrawl(double amtToBeWithdrawn);
	
	public default void transferFundsToAnotherAccount(Account account,double amtToBeTransfered) {
		
		this.withdrawl(amtToBeTransfered);

		if (account instanceof BankingServices) {
			
			((BankingServices)account).deposit(amtToBeTransfered);

		}
		else if(account instanceof SavingAccount) {
			((SavingAccount)account).deposit(amtToBeTransfered);
		}
		else((CheckingAccount)account).deposit(amtToBeTransfered);
		
			
	}
	
	
	
	
}
