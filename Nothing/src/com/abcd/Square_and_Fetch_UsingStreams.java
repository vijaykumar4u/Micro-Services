package com.abcd;

import java.util.Arrays;
import java.util.List;

public class Square_and_Fetch_UsingStreams {

	public static void main(String[] args) {
		List<Integer> list  =  Arrays.asList(8,5,10,20,30,40,50,60);
		list.stream().map(m->m*m).filter(p->p>200).forEach(System.out::println);
		
	}

	
}
