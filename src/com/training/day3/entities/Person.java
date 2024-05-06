package com.training.day3.entities;

import java.io.Serializable;
import java.time.LocalDate;

import com.training.day4.entities.Account;

//POJO

//where you are defining your entity 
//model 
//here you define its  private data members
//plus constructors -overloaded
//plus getters and setters for its attributes
//plus toString
//plus equals hashcode 
//business logic method for this class

//what is the sole purpose of this class Person
//defining the template of Person,what necessary data and code, a Person object should have
public class Person implements Serializable {
	//you keep the data private 
	//6 instance variables
	//every instance ,every object of Person will have id name mn em add dob
	
	//has a relationship
	
	private long id;
	private String name;
	private String mobileNumber;
	private String emailAddress;
	private Address address;
	private LocalDate dob;
	//Person has  an account of  Account Type 
	private  Account[] accounts;
	

	public Account[] getAccounts() {
		return accounts;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}


	//this is static variable ,class variable  , one copy per class in jvm 
	private static int ctr = 0;
	
	
	//there is only one constructor through which I want to create an object of this class
	//how many args are needed to create this Person object
	
	
	  public Person(long idd, String name,String mn, String em,Address a,
			  LocalDate  d) {
	  
	  this.id=idd; 
	  this.name=name;
	  this.mobileNumber=mn; 
	  this.emailAddress=em;
	  this.dob =d; 
	  this.address=a;
	  //here we are incrementing the value of ctr  whenever we are creating Person object 
	    ctr++;
	    
	  }
	 
	  
	  //overloaded constructors
	  
	  
	 
	   
	  

	//create public methods to accesss / mutate them
	//getters and setters 

	
	//non static -- instance method , this method can be called from instance of the class
//access specifier   modifier return type /methodname( parameters1 ,p2...){logic }

    
    
    //constructors
	
	
	
	//toString 
	//earlier when we printed sysout(p1)  -- it called p1.toString() implicitly  , if we dont override toString method  ,which impl is provided , java.lang.Object where we get fully qualified classname 
	/*
	 * @Override public String toString() { return "Name :" +this.name+
	 * " DOB"+this.dob +"Mobile Number "+this.mobileNumber
	 * +"\nAddress "+this.address;
	 * 
	 * }
	 */
    @Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", emailAddress="
				+ emailAddress + ", address=" + address + ", dob=" + dob;
				
	}


    //for ctr I dont want to set it through setter method
    //here the purpose of this method getCtr()  , we are getting the current value of ctr
    //getCtr , I dont have to create an object of this class
    //Person.getCtr() --where will we write this instruction
    //in the client code where  you want the value of ctr
    
    
	public static int getCtr() {
		return ctr;
	}

//non static , means instance method , means belonging to current instance
	//p1.getId()  --- Is p1 a class or an object -- Person p1 = new Person() ;  p1..setId(1111) ;  p1.getId();
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	

}
