package com.abcd;

public class Fibanoic_Seriess {

	public static int fib(int number) {
		if(number<=1)
			return number;
		return  fib(number-1)+fib(number-2);
	}
	public static void main(String[] args) {
		int gNumber = 4;
		for (int i = 0; i < gNumber; i++) {
			System.out.println(fib(i)+" ");
			
		}
	}
	
	
}
