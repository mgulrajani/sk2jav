package com.training.day2;

import com.training.utils.ConnectionManager;

//access specifier  -- public package-friendly

//it can be accessed from other packages as well
/**
 * 
 * Integral -- byte short int long char
 * logical boolean
 * floating   float double
 * 
 */
public class DataTypeDemo {
     /* this is a demo for data types */
	
	public static final int DATA_TYPES = 8;
	public static void main(String [] args) {
		
		int a;  //declaring
		a = 100;  //assigning
		//declaration and assignment
		//byte -128  to 127  -- 1 byte
		//int   --4 bytes
		
		
		int normalInt =12 ;
		int remainder = normalInt %3;
		
		int intBaseEight = 017;
		int intHexaDec = 0X12;
		long cCardNum =  2342_343_543_534_953L;
		int someBinVal =  0b0100_1110;
		// it cant put a value which is of double type in a variable of float type
		//float 4 bytes
		//double 8 bytes
		//casting --you will have to tellthe compiler that you are ok with the data loss
		
		
		float  val1 = (float)0.9;
		double val2 =98.4545;
		
		char letter1 = 'a';
		char  letter2 = '\u27DC';
		char backslash = '\\';
		
		boolean isValid = true ;
	
		if(isValid) {
			
			System.out.println("Application is Valid "+isValid);
		}
		System.out.println(backslash);
		
		System.out.println(someBinVal);
		
		System.out.println(letter2);
		
		System.out.println(someBinVal + normalInt);
	
		short  a1 = 32676;
		
		short b1 = 32445 ;
		
		short c1  = (short) (a1+b1) ;
		
		int d1 = a1+b1;
		System.out.println(c1);
		System.out.println(d1);
	
	}
	
	
	
	
}
