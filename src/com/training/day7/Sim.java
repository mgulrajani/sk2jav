package com.training.day7;

public interface Sim {
void data();
void calling();
}
interface InternationalSim extends Sim{
	void videocalling();
	
}

  class Jio implements Sim{

	
	public void data() {
		System.out.println("jio data");
		
	}

	public void calling() {
		System.out.println("jio calling");
		
	}
	
	
}
//class Manager extends Employee 
  //we can create reference of Parent and object child
  //Liskov's substitution
  //is a  relationship in inheritance
  
  //implementation  --- is
  
class Airtel implements Sim,InternationalSim{

	@Override
	public void data() {
		System.out.println("airtel data");
		
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("airtel calling");
	}

	@Override
	public void videocalling() {
		// TODO Auto-generated method stub
		System.out.println("airtel video calling");
	}
	
}

class Voda implements Sim{

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Voda data");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("voda  calling");
	}
	
	
}