package com.abcd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting_basedOn_Salary_Name {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("vijay", 65000));
		list.add(new Person("vivek", 40000));
		list.add(new Person("ganesh", 75000));
		list.add(new Person("ravi", 80000));
		list.add(new Person("aksha", 65000));

		list.stream().sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getName))
				.forEach(System.out::println);

		
		
	}

}
