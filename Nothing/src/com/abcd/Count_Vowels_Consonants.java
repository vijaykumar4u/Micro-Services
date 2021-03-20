package com.abcd;

public class Count_Vowels_Consonants {
	public static void main(String[] args) {
		String string = "This is a really simple sentence";
		string.toLowerCase();
		int vCount=0;
		int cCount = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)=='a'|| string.charAt(i)=='e' || string.charAt(i)=='i' ||
					string.charAt(i)=='o' || string.charAt(i)=='u') {
				vCount++;
				
			}else if(string.charAt(i)>='a' && string.charAt(i)<='z'){
				cCount++;
				
				
			}
		}
		System.out.println("Vowels Clount "+vCount+"========= "+"Consonant Count "+cCount);
	}

}
