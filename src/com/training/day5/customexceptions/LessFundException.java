package com.training.day5.customexceptions;

//here we are creating our own custom exception class which we will throw when funds are less
public class LessFundException extends Exception {
	
	private String message;
   
	public String getMessage() {
		return message;
	}

	public LessFundException(String message) {
		super(message);
	}
//how many ways of creating LessFundException object are shown here
//how many constructors are there ?
	
//only one constructor
//only one way of constructing this object
	
}
