package com.abcd;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String str1 = "Brag";
		String str2 = "Grab";
		str1 = str1.toLowerCase();

		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Both strings are not anagram !!");
		} else {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if (Arrays.equals(arr1, arr2) == true) {
				System.out.println("Both strings are anagram");
			} else {
				System.out.println("Both Strings are not anagram");
			}

		}

	}

}
