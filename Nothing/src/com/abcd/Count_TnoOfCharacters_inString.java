package com.abcd;

public class Count_TnoOfCharacters_inString {
public static void main(String[] args) {
	String s = "My lord if your not with me i couldn't even breath";
    int count=0;
    for (int i = 0; i < s.length(); i++) {
 	   if(s.charAt(i)!=' ') {
 		   count++;
 	   }

		
	}
    System.out.println(count);
}
}
