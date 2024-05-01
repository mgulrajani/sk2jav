package com.training.day4.services;

import com.training.day4.entities.Account;
import com.training.day4.entities.CheckingAccount;
import com.training.day4.entities.SavingAccount;
import com.training.day5.customexceptions.LessFundException;

//prior to 1.8 all the methods in interfaces were abstract 
//100% abstraction
//default methods and static methods in the interfaces , 
//transferFundsToAnotherAccount , as it is going to have same logic in all the implementation class ,
//we are using the DRY  principle --Do Not Repeat Yourself
public interface BankingServices {

	//we will declare the methods
	
	//deposit withdrawl transfer of funds from 1 acct to another
			
	public void deposit(double amtToBeDeposited);
	
	public void withdrawl(double amtToBeWithdrawn) throws LessFundException;
	
	public default void transferFundsToAnotherAccount(Account account,double amtToBeTransfered)  throws LessFundException{
		
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
