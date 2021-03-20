package com.abcd;

public class Factorial {

	public static void main(String[] args) {
		int i ,fact = 1,no=5;
		for ( i = 1; i <=no; i++) {
			fact = fact*i;
			
		}
		System.out.println("factorial of "+no+" is "+fact);
	}
}

