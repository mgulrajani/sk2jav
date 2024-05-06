package com.training.day6;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name =  sc.nextLine();
		
		System.out.println("Enter gender");
		char gender =  sc.next().charAt(0);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter age");
		
		int age =sc2.nextInt();
		
		System.out.println("Enter mobile number");
		long mn =  sc2.nextLong();
		
		System.out.println("you entered "+"Name:"+ name +"Gender :"+ gender+"Age:"+ age+"Mobile Number"+ mn);

		
		
	}
}
