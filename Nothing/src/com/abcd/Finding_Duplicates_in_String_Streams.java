package com.abcd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Finding_Duplicates_in_String_Streams {
	public static <T> Set<T> findDuplicatesInStreams(List<T> list) {
		return

		list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("vijay","ganesh","aksha","vijay","ganesh");
         
		System.out.println(findDuplicatesInStreams(list));
	
	}

}

