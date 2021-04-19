package com.abcd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Finding_Max_Min_Price_or_Salary {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("vijay", 65000));
		list.add(new Person("vivek", 40000));
		list.add(new Person("ganesh", 75000));
		list.add(new Person("ravi", 80000));
		list.add(new Person("aksha", 65000));

// fetching max salary record
		Optional<Person> maxSalary = list.stream().collect(Collectors.maxBy(Comparator.comparing(p -> p.getSalary())));
		System.out.println(maxSalary.get());
		System.out.println("=====================================================");
		Optional<Person> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(p -> p.getSalary())));
		System.out.println(minSalary.get());
		System.out.println("=================================");
		// fetching only salary
//		double sal = maxSalary.get().getSalary();
//		System.out.println(sal);

		// it also using optional class --> the get() is from optional which fetch the
		// person record of highest salary
		Person maxSal = list.stream().max(Comparator.comparing(p -> p.getSalary())).get();// we can use both lambda or
																							// method reference
		System.out.println(maxSal);
		System.out.println("=================================================");

		// fetching minimum salary

		Person minSal = list.stream().min(Comparator.comparing(Person::getSalary)).get();
		System.out.println(minSal);

	}

}
