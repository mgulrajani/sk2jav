package com.training.day4.entities;

import com.training.day4.services.BankingServices;
import com.training.day4.services.NRIBankingServices;
import com.training.day5.customexceptions.LessFundException;

public  class SavingAccount extends Account implements BankingServices , NRIBankingServices{

	private final double interestEarned =  100;
	
	public SavingAccount(long id, double balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	public double getInterestEarned() {
		return interestEarned;
	}

	public final void setInterestEarned(double interestEarned) {
		//this.interestEarned = interestEarned;
		double balance = this.getBalance();
		this.setBalance(balance+interestEarned);
		
	}

	
	@Override
	public String toString() {
		return super.toString() + "Interest Earned"+interestEarned;
		
				
				
	}

	//here deposit is defined 
	//not called
	
	@Override
	public void deposit(double amtToBeDeposited) {
		this.setBalance(this.getBalance()+amtToBeDeposited);
	}

	
	//here withdrawl is defined
	//when compiler comes across acall to this method it should know that if the funds are less , it might throw  LessFundException object
	
	@Override
	public void withdrawl(double amtToBeWithdrawn) throws LessFundException{
		if(this.getBalance() > amtToBeWithdrawn) {
			this.setBalance(this.getBalance()-amtToBeWithdrawn);
			
		}
		else {
			throw new LessFundException("Not enough funds");
			
		}
	}

	@Override
	public void nriFundsTransfer(double amt, double commission) {
		System.out.println("nri funds "+amt+ commission);

		
	}

	
	}
	


