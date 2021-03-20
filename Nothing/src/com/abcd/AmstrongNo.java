package com.abcd;

public class AmstrongNo {
public static void main(String[] args) {
	//amstrong no 153   407  371   370
	int n = 407,r,s=0;
int t = n;
   while(n>0) {
	   r = n%10;
	   n = n/10;
	   s = s+(r*r*r);
   }
   if(t==s)
   {
	   System.out.println(s+" is Amstrong no");
   }else {
	System.out.println(s+" is not a Amstrong No");
}
   
}	

	
	
}
