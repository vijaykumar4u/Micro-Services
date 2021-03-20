package com.abcd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDuplicate_Remove {

	//Remove Duplicate 
	public static void main(String[] args) {
		String[] sampleArr = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		
		List<String> list = Arrays.asList(sampleArr);
		List<String> dupli = list.stream().distinct().collect(Collectors.toList());
		
for (String object : dupli) {
	
	
	System.out.println(object);
}
		
	}
	
	
	
	

}
