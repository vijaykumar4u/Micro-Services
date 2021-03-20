package com.abcd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda_Stream_Sorting {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		list.add(new Person("vijay", 60000));
		list.add(new Person("raju", 900000));
		list.add(new Person("sai", 500000));
		list.add(new Person("anusha", 1000000));

		 //list.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
		list.stream().sorted(Comparator.comparing(per->per.getName())).forEach(System.out::println);
		System.out.println("***************");
		
		list.stream().sorted(Comparator.comparing(per->per.getSalary())).forEach(System.out::println);
		System.out.println();
		list.stream().sorted(Comparator.comparing(Person::getSalary)).forEach(System.out::println);

		
		

		// list.stream().sorted(Comparator.comparing(Person::getSalary)).forEach(System.out::println);

//		Collections.sort(list, new Mycomparator());
//		for (Person person : list) {
//			
//			System.out.println(person);
//		}

//		Collections.sort(list,(o1, o2)-> 	
//			 (int) (o1.getSalary() - o2.getSalary()));
//		
//		System.out.println(list);

	//	list.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);

//		System.out.println("*****************************************************");
//		list.stream().sorted((o1, o2)-> 	
//	  o1.name.compareTo(o2.name)).forEach(System.out::println);
//		
	}
}

/*
 * class Mycomparator implements Comparator<Person> {
 * 
 * @Override public int compare(Person o1, Person o2) {
 * 
 * return (int) (o1.getSalary() - o2.getSalary()); }
 * 
 * }
 */
