package com.training.day4.entities;

import com.training.day4.services.BankingServices;

public class CheckingAccount extends Account  implements BankingServices {

	private double overdraftAmt;
	
	public CheckingAccount(long id, double balance,double overdraft) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	this.overdraftAmt = overdraft;
	
	}

	public double getOverdraftAmt() {
		return overdraftAmt;
	}

	@Override
	public String toString() {
		return "CheckingAccount [overdraftAmt=" + overdraftAmt + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void deposit(double amtToBeDeposited) {
		this.setBalance(this.getBalance()+amtToBeDeposited);
		
	}

	@Override
	public void withdrawl(double amtToBeWithdrawn) {
		if (amtToBeWithdrawn < (this.getBalance()+this.overdraftAmt)) {
			
			this.setBalance(this.getBalance()-amtToBeWithdrawn);
		}
		else
		{
			System.out.println("Not enough funds");
		}
	}

	
	
	
	

}
