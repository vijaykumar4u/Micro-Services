package com.abcd;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateREmove_Array {

	public static void main(String[] args) {
		
		
		String[] arr = {"vijay","sai","uha","sai","anusha","vijay","uha","akshara"};
		
		
//	List<String> alist = 	Arrays.asList(arr);
//	
//	HashSet<String> hset = new HashSet<String>(alist);
//	for (String string : hset) {
//		System.out.println(string);
//	}
		
		int len = arr.length;
		Arrays.sort(arr);
		String[] temp=new String[len];
		int j=0;
		for (int i = 0; i < len-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j] = arr[i];
				j++;
			
			}	
		
			
			
			
		}temp[j++] = arr[len - 1];
		for (int k = 0; k < j; k++) {
			System.out.print(temp[k]+" ");
			
		}
		//Manual Sorting code 
//		int arr[] = { 10, 11, 10, 12, 10, 11, 12, 13, 11 };
//		int temp = 0;
//		int uniqeElem[] = new int[arr.length];
//		int j = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int k = i + 1; k < arr.length; k++) {
//				if (arr[i] > arr[k]) {
//					temp = arr[i];
//					arr[i] = arr[k];
//					arr[k] = temp;
//
//				}
//
//			}
//
//		}
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] != arr[i + 1]) {
//				uniqeElem[j] = arr[i];
//				j++;
//
//			}
//
//		}
//		uniqeElem[j++] = arr[arr.length - 1];
//		for (int k = 0; k < j; k++) {
//			System.out.println(uniqeElem[k]);
//
//		}

		

			
		}
	}
