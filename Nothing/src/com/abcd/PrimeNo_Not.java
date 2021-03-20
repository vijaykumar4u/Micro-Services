package com.abcd;

public class PrimeNo_Not {

	public static void main(String[] args) {
		int no = 11;
		boolean flag = true;

		for (int i = 2; i < no; i++) {

			if (no % i == 0) {
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println(no + " is a prime number");
		} else {
			System.out.println(no + " is not a prime no");
		}
	}
}
