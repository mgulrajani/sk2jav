package com.training.day2;

public class StringDemo {

	public static void main(String[] args) {
		//this instruction created a reference str and "hello" object  
		
				
		String str = "hello";
		
		//a new String object is getting created it is not using the Shared Pool
		String str2 =new String("hello");
		
		int code=10001;
		String str3 = "hello";
		
		//== means referencing the same object in heap
		
		System.out.println(str == str3);
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.printf("The message is %s and the code is %d",str,code );
	}
}
