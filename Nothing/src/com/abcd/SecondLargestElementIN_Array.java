package com.abcd;

import java.util.Arrays;

public class SecondLargestElementIN_Array {
	public static void main(String[] args) {
		int[] arr = {2,5,4,1,3,6,7};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}

}
