package com.abcd;

public class CopyElements_OneArrayTo_OtherArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] clonedArray  = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			clonedArray[i] = arr[i];
			
		}
		for (int i = 0; i < clonedArray.length; i++) {
			System.out.println(clonedArray[i]);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
