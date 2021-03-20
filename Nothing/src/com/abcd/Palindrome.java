package com.abcd;

public class Palindrome {
public static void main(String[] args) {
	
	int n = 12345,r,s=0;
int t = n;
   while(n>0) {
	   r = n%10;
	   n = n/10;
	   s = s*10+r;
   }
   if(t==s)
   {
	   System.out.println(s+" is palindrom");
   }else {
	System.out.println(s+" is not a palindrom");
  // System.out.println(s);no reverse remove if condition
}
   
}	

	
	
}
