package com.training.day3.apps;

import java.time.LocalDate;

import com.training.day3.entities.Address;
import com.training.day3.entities.Person;
import com.training.day4.entities.Account;
import com.training.day4.entities.CheckingAccount;
import com.training.day4.entities.SavingAccount;

public class App {

	public static void main(String[] args) {
		//how to create a Person object with a call to the constructor with 6 args
		Address address = new Address("The Signature","MGM Road","Pune","3434344","Opp school");
		
		LocalDate dob = LocalDate.of(2000, 11, 3);
		
		Person p1=new Person(111,"Hetal","435453455","hetal@gmail",address,dob);
		
		Account hetalAccount1 = new SavingAccount(456456546,10000);
		((SavingAccount)hetalAccount1).setInterestEarned(1000);
		
		Account hetalAccount2 = new CheckingAccount(454566, 100000, 50000);
		//we have created 2 Account objects for Hetal
		
		//polymorohism  -- reference variable is of Account type 
		//what is the object is an array of savingaccount checkingaccount
		Account[] accts = {hetalAccount1,hetalAccount2};
		
		p1.setAccounts(accts);

		for(Account a: p1.getAccounts()) {
			System.out.println(a);
		}
		
			
		//if you want to print the complete object  stringified data  , use toString method
		
		
		//client code  you are trying to construct address object without any arguments
		
		Address address1 = new Address("bldg","stree","city","435435","landmark");
		
		Person p2=new Person(112,"Mohan","575676575","mohan@gmail",address,dob.plusYears(2));
		//declaring a reference variable of type Account , no mem allocation
		Account mohanAccount1 ;
		//here I am doing the mem allocation by calling SavingAccount constructor
		mohanAccount1= new SavingAccount(6774545,20000);
		
		Account mohanAccount2 = new CheckingAccount(78888, 200000, 100000);
		
		
		System.out.println(p1.getName() +p1.getDob());

		//can I display hetal's account  balance
		//System.out.println(p1.getAccount().getBalance());
		
		System.out.println(p1);
		System.out.println(p2);
		Person p3=new Person(113,"amit","543546","email",address1,LocalDate.now().minusYears(20));
		System.out.println(p3);
		System.out.println(Person.getCtr());
 
		
		
		

	}
}
