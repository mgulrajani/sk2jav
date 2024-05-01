package com.training.day4.entities;

//entity Account  

//POJO

//where you are defining your entity 
//model 
//here you define its  private data members
//plus constructors -overloaded
//plus getters and setters for its attributes
//plus toString
//plus equals hashcode 
//business logic method for this class

public class Account {

	//2 attributes /data members /instance variables that are private 
	private long id;
	private double balance;
	
	
	//one and only one constructor  , because I want Account object to be constructed with id and balance
	
	public Account(long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	//accessors and mutators
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//string representation of Account object
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	
	
}
