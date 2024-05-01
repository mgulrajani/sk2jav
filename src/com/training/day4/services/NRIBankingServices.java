package com.training.day4.services;

public interface NRIBankingServices  extends BankingServices{
	public void nriFundsTransfer(double amt, double commission);

}
