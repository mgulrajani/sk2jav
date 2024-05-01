package com.training.day3.entities;
//sole purpose class of this class should be only to define Address

//POJO

//where you are defining your entity 
//model 
//here you define its  private data members
//plus constructors -overloaded
//plus getters and setters for its attributes
//plus toString
//plus equals hashcode 
//business logic method for this class
//java.lang.Object  --is a cosmic parent
public class Address {
	
	private String bldgName;
	private String streetName;
	private String city;
	private String pincode;
	private String landmark;
	
	
	//you can overloaded constructors
	// you are designer of the class 
	//objects of Address should be only created with all the 5 args
	
	
	//be designer of the class
	//you define what will be its attributes 
	//one constructor which takes 5 String parameters to construct the Address object
	public Address(String bldgName, String streetName, String city, String pincode, String landmark) {
		super();
		this.bldgName = bldgName;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
		this.landmark = landmark;
	}
	
	

	//most of the codes for POJO will be generated automatically thru IDE features
	@Override
	
	public String toString() {
		
		return this.streetName+ this.city+this.pincode+this.bldgName+this.landmark;
	}

}
