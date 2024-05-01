package com.training.day3;

public class ConstructsDemo {
	
	public static void main(String[] args) {
		//using the for each loop
		//on the RHS of : args is given  , it is arguments in the type String array
		//passed to the main method
		//LHS of : we have declared str of String type
		
		/*
		 * for (String str : args) {
		 * 
		 * System.out.println("Welcome "+str); System.out.println();
		 * 
		 * }
		 */
		
		//traditional for loop to iterate args
		
		for(int i=0;i<args.length;i++) {
			//exit the loop after Welcoming Hetal
			if (args[i].equalsIgnoreCase("Hetal"))
				continue;
			System.out.println("Welcome"+args[i]);
			
		}
		
		
		
		int i=5;
		String favFruit = "Mango";
		if (i==5) {
			System.out.println("five");
		}
		else if(i == 10) {
			System.out.println("Ten");
		}
		else {
			System.out.println("Neither Five Nor Ten");
		}
		
		
		switch(favFruit) {
		case "Apple":
			System.out.println("There is a saying attached to it");
			System.out.println();
			//logic
			break;
		case "Mango":
			System.out.println("Summer Fruit");
			break;
		default:
			System.out.println("Some other fruit");
			
		}

		 /**
		  * 
		  * fixed iterations ,or you are iterating thru a collection -- you can go with for loop
		  * 
		  * 
		  * 
		  * for loop -- for(initial  val ; condition ; inc/dec){
		  * 
		  * 
		  * }
		  * 
		  * enhanced for loop , for each loop 
		  * for(String name : names){instructions}
		  * on the RHS is the Collection -- Set ,List, Array
		  * LHS is the individual element declaration which will 
		  * carry the current value
		  * 
		  * 
		  * while(collection.hasMoreElements()){
		  * 
		  * 
		  * String str =(String) collection.nextElement();
		  * 
		  * }
		  * 
		  * 
		  * at least run the instructions once , without bothering whether the 
		  * terminating condition is met , do...while
		  * 
		  * 
		  */
		
		outer:
		for(int k=0;k<5;k++) {
			System.out.println("K is"+k);
			for(int m=0;m<3;m++) {
				System.out.println("M is "+m);
				if(m==1)
					break outer;
				
			}
			
		}
	
		
	}

}
