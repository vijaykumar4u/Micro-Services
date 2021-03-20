package com.abcd;

import java.util.Arrays;

public class Frequency_of_Array {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
				boolean[] flagVisited = new boolean[arr.length];
				Arrays.fill(flagVisited, false);
				for (int i = 0; i < arr.length; i++) {
					
					if(flagVisited[i]==true)
						continue;
					int count=1;
					for (int j = i+1; j < arr.length; j++) {
						if(arr[i]==arr[j]) {
							flagVisited[j] = true;
							count++;
							
						}
						
					}System.out.println(arr[i]+" "+count);
				}
	}
}
