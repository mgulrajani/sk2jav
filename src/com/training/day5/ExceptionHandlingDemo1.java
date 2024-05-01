package com.training.day5;

public class ExceptionHandlingDemo1 {
	
	public static void main(String[] args) {
	//we have handled it  , using try .. block will have the regular code , in which
		//you might have instructions which might throw some exceptions at the runtime
		//catch block , you can be more specific or generalised 
		
	try {
	int arr[] = {2,0,5,6};
	
	int x=10;
	
	for (int i=0;i<5;i++) {
		
		System.out.println(x/arr[i]);
	}
		
	}
	catch(ArithmeticException ae) {
		System.out.println("Number cannot be divided by zero");
	}
	catch(ArrayIndexOutOfBoundsException  aob) {
		
		System.out.println(aob.getMessage());
		
	}
	catch(Exception e) {
	System.out.println("Some exception has occured");
	System.out.println(e.getMessage());
		
	}
	System.out.println("and the execution continues gracefully");
	}
}
