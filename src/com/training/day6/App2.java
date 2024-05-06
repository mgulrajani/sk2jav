package com.training.day6;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.training.day3.entities.Person;

public class App2 {
	
	public static void main(String[] args) {
		try(
			FileInputStream fis = new FileInputStream("d:\\persondata.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
				){
			
			Person[] data = (Person[])ois.readObject();
			
			for(Person p:data) {
				System.out.println(p);
			}
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
