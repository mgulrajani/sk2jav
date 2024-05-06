package com.training.day6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import com.training.day3.entities.Address;
import com.training.day3.entities.Person;
import com.training.day4.entities.Account;
import com.training.day4.entities.CheckingAccount;
import com.training.day4.entities.SavingAccount;

public class App {
	
	public static void main(String[] args) {
		
	Address address = new Address("The Signature","MGM Road","Pune","3434344","Opp school");

	LocalDate dob = LocalDate.of(2000, 11, 3);

	Person p1=new Person(111,"Hetal","435453455","hetal@gmail",address,dob);

	Account hetalAccount1 = new SavingAccount(456456546,10000);
	((SavingAccount)hetalAccount1).setInterestEarned(1000);

	Account hetalAccount2 = new CheckingAccount(454566, 100000, 50000);
	Account[] accts = {hetalAccount1,hetalAccount2};

	p1.setAccounts(accts);
	
	Address address1 = new Address("bldg","stree","city","435435","landmark");
	
	Person p2=new Person(112,"Mohan","575676575","mohan@gmail",address,dob.plusYears(2));
	//declaring a reference variable of type Account , no mem allocation
	Account mohanAccount1 ;
	//here I am doing the mem allocation by calling SavingAccount constructor
	mohanAccount1= new SavingAccount(6774545,20000);
	
	Account mohanAccount2 = new CheckingAccount(78888, 200000, 100000);
	Account[] acct2 = {mohanAccount1,mohanAccount2};
	
	
	p2.setAccounts(acct2);

	Person[] people = {p1,p2};
	
	//we have got 2 concrete objects p1 and p2 , p1 is of Person type and p2 is also Person type and Person class is serializable
	
	//Person has a dependency on Account and Address , which are also serializable
	
	//to write the person array object to the file  persondata.txt
	
	try(FileOutputStream fos =  new FileOutputStream("d:\\persondata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
		
		oos.writeObject(people);
		System.out.println("people object written on to the file");
		
	}
	catch(Exception e) {e.printStackTrace();}


	}
}
