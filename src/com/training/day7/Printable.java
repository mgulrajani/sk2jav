package com.training.day7;
//SAM
//Functional interfaces
//if you have only one abstract method in an interface 
/***
 * 
 * 
 * there are 3 types of FunctionalInterfaces -- 1.prior to java 1.8(Runnable interface ,Callable  )
 * 
 * which were introduced in1.8  --Predicate -test , Consumer accept Supplier get Function val,val2
 * 
 * custom functional interfaces  like the one which we have created here Printable
 */



@FunctionalInterface


public interface Printable {

	void print();
	
	
}


class Square implements Printable{

	@Override
	public void print() {
		System.out.println("printing square");
	}
	
	
	
}
//need to create a class which implements this interface  

