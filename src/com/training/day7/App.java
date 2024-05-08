package com.training.day7;

import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
      InternationalSim isim=new PureIT();
		//code to abstraction
	  System.out.println("1 . Airtel");
	  System.out.println("2 . Jio");
	  System.out.println("3 . Vodafone");
	  
	  Scanner scanner = new Scanner(System.in);
	  int choice =  scanner.nextInt();
	  Sim sim = null;
	  
	  switch(choice) {
	  
	  case 1:
		  sim = new Airtel();
		  break;
	  case 2:
		  sim = new Jio();
		  break;
	  case 3:
		  sim= new Voda();
		  break;
	  
	  
	  }
	  
      register(sim);
      internationalRegistration(isim);
	}

	private static void internationalRegistration(InternationalSim isim) {
		
		if (isim instanceof Airtel) {
			System.out.println("Airtel supports international video calling");
		}
		else
			System.out.println("some other provider " );
		    
		isim.videocalling();
	}

	private static void register(Sim sim) {
		// TODO Auto-generated method stub
		System.out.println("registering "+sim);
	}




	

}


