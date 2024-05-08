package com.training.day7;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

import com.training.day4.entities.Account;
import com.training.day4.entities.SavingAccount;

//Consumer Supplier Function Predicate
//Collection

interface Math{
	int add(int a,int b);
}
public class App2 {

	public static void main(String[] args) {
		Printable p3=null;
		Printable p = new Square();
		p.print();
		
		Printable p2 =  new Printable() {
			
			@Override
			public void print() {
				System.out.println("Printing anonymous object");
								
			}
		};
		
		
		p2.print();
		
		//functional programming 
		//lambdas
		p3=()->System.out.println("printing p3");
		Printable p4 = ()->System.out.println(4);
		
		printData(p3);
		printData(p4);
		Math m1=(m,q)->m+q;
		System.out.println(m1.add(6, 7));
		
		
		Math m2=(k,l)->(k*2)+(l*2);
		System.out.println(m2.add(3, 2));
		
		Predicate<String> test1 = (s)-> s.endsWith("m") ;
		
		Predicate<Integer> test2  =(i)->i%2==0;
		
		Consumer<Integer> consumer1=  (a)->System.out.println(a+3);
		
		Consumer<Account> cons2 = System.out::println;
		
		Consumer<Account> acctConsumer = (acct)->System.out.println(acct);
		Account ac = new SavingAccount(343434, 121212);
		consumer1.accept(5);
		System.out.println("printing account object using method reference ");
		Account act1 = new SavingAccount(6677, 123333);
		cons2.accept(act1);
		
		acctConsumer.accept(ac);
		
		IntSupplier intSup =()-> {return 10+10-7*4;};
		
	    Function<Integer,String> f1 = (a)->{
	    	System.out.println(a);
	    	return "finished processing";
	    };
	    
	    System.out.println(f1.apply(6));
	    
	    
		
		System.out.println("Integer Supplier providing with a value"+intSup.getAsInt());
		
		
		if (checkData(test1,"motivation")) {
		  System.out.println("ends with m");
		  
		}else {
			System.out.println("does not end with m ");
			
		}
		if (checkData(test2,12)) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		
	}

	private static boolean checkData(Predicate<Integer> test2, int i) {
		
		return test2.test(i);
	}

	private static boolean checkData(Predicate<String> test1, String string) {
		return test1.test(string);
		
	}

	private static void printData(Printable p) {
		
		p.print();
		
	}
}
