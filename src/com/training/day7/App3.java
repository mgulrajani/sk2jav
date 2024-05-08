package com.training.day7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.training.day3.entities.Address;
import com.training.day3.entities.Person;

public class App3 {

	public static void main(String[] args) {
		
		Integer val = 3;
		val++;
		int val2 = new Integer(9);
		val2++;
		
		//boxing and unboxing 
		
		//gift wrapping  -- boxing the primitive value ,means u are wrapping the primitive inside a wrapper object  so that it can be passed around as an object to collection 
		
		//unboxing -- removing that gift  ,data  ,the primitive value
		
		List<Person> people = new ArrayList<>();
		Person p1 =new Person(332, "kajal", "435543543", "kajal@gm", new Address("bldg","street","city","pin1","land1"),LocalDate.of(1999, 12, 21));
		
		Person p2 =new Person(455, "mitali", "435543543", "mit@gm", new Address("bldg","street","city","pin1","land1"),LocalDate.of(1998, 12, 21));
		
		Person p3 =new Person(233, "harsh", "435543543", "har@gm", new Address("bldg","street","city","pin1","land1"),LocalDate.of(1996, 12, 21));
		
		Person p4 =new Person(111, "sid", "435543543", "sid@gm", new Address("bldg","street","city","pin1","land1"),LocalDate.of(2000, 12, 21));
		
		people.add(p2);
		people.add(p1);

		people.add(p3);
		people.add(p4);

		
		for (Person p :people) {
			
			System.out.println(p);
			
		}

		
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(65);
		list.add(212);
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(list.size());
		System.out.println(list.get(2));
		
		
	}
}
