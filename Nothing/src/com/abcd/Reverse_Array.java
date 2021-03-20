package com.abcd;

public class Reverse_Array {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		int[] b = new int[arr.length];

		int j = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			
			b[j-1]  = arr[i];
			j--;
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
