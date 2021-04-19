package com.abcd;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Printing_Duplicates_Streams {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("vijay", "ganesh", "aksha", "vijay", "ganesh","sai","uha","anusha","sai","anusha");
		Set<String> set = new HashSet<>(list);
		for (String string : set) {
			System.out.println(string+": "+Collections.frequency(list, string));
		}

	}


}
