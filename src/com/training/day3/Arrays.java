package com.training.day3;

/**
 *Arrays are objects 
 * String[] namesArr;
 * String namesArr[];
 *fixed size and type
 *index  starts with 0
 *length  instance variables which calls getter for length or size of the array
 
 *Declare the array
 *create the array
 *populate the array

 *you can create arrays of primitive data types 
 *and also objects 
 *
 */
public class Arrays {
	public static void main(String[] args) {
		int []myArr;      //declaring an array myArr
		myArr= new int[5];  //contiguous mem allocation for 5 ints , def value will be 0
		
		//myArr[0] =3 --this is how you  assign
		//loop created to assign values to the array elements
		for(int i=0;i<myArr.length;i++) {
			myArr[i]=(i+1)*2;
			
		}
		
		//I want to print the data of the array myArr
		System.out.println(myArr);
		
		//use for loop to iterate through the array
		
		for (int j:myArr) {
			
			System.out.print(j+"\t");
		}
		
		
		
	}

}
