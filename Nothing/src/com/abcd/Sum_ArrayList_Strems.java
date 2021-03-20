package com.abcd;

import java.util.Arrays;
import java.util.List;

public class Sum_ArrayList_Strems {
	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
		long sum = ints.stream().mapToLong(Integer::longValue).sum();
		System.out.println(sum);
		
		
	}
}
