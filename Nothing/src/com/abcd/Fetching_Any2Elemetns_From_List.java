package com.abcd;

import java.util.ArrayList;
import java.util.List;

public class Fetching_Any2Elemetns_From_List {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();

		pList.add(new Person("vijay", 250000));
		pList.add(new Person("Dhana", 300000));
		pList.add(new Person("Ravi", 70000));
		pList.add(new Person("Vivek", 850000));
		pList.stream().forEach(s->System.out.println(s.getName()+" "+s.getSalary()));

	}

}
