package com.training.day4.entities;

import com.training.day4.services.BankingServices;

public  class SavingAccount extends Account implements BankingServices{

	private double interestEarned;
	
	public SavingAccount(long id, double balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	public double getInterestEarned() {
		return interestEarned;
	}

	public void setInterestEarned(double interestEarned) {
		this.interestEarned = interestEarned;
		double balance = this.getBalance();
		this.setBalance(balance+interestEarned);
		
	}

	
	@Override
	public String toString() {
		return super.toString() + "Interest Earned"+interestEarned;
		
				
				
	}

	@Override
	public void deposit(double amtToBeDeposited) {
		this.setBalance(this.getBalance()+amtToBeDeposited);
	}

	@Override
	public void withdrawl(double amtToBeWithdrawn) {
		if(this.getBalance() > amtToBeWithdrawn) {
			this.setBalance(this.getBalance()-amtToBeWithdrawn);
			
		}
		else {
			System.out.println("Less funds");
		}
	}

	
	}
	


