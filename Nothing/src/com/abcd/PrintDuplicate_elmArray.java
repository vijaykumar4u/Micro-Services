package com.abcd;

import java.util.Arrays;

public class PrintDuplicate_elmArray {
	public static void main(String[] args) {
		String[] arr = {"vijay","sai","uha","sai","anusha","vijay","anusha","uha","aksha"};
		String[] duplicates  = new String[arr.length];
		int j = 0;
		
		
		//Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int k = i+1; k < arr.length; k++) {
				if(arr[i].compareTo(arr[k])>0) {
					String temp = arr[i];
					arr[i] =  arr[k];
					arr[k]  = temp;
				}
				
			}
			
		}
		
		
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				duplicates[j] =  arr[i];
				j++;
			}
		}
		for (int k = 0; k < j; k++) {
			System.out.println(duplicates[k]);
			
		}
		
	}

}
