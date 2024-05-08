package com.training.day7;

public class WithEnum {
	
	public static void main(String[] args) {
		
		Month currentMonth = Month.MAY;
		System.out.println("Current month has "+currentMonth.getDaysInAMonth());
		
		//iterate thru all the enums
		
		for(Month m: Month.values()){
			System.out.println(m +""+ m.getDaysInAMonth());

		}
		
		switch(currentMonth) {
			case DECEMBER:
				System.out.println("Christmas holidays!!");
				break;
			case MAY:
				System.out.println("Enjoy your summers with Mangoes and Icecreams!!");
				break;
				
	}
	}
}