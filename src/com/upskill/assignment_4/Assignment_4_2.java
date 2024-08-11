package com.upskill.assignment_4;

public class Assignment_4_2 {
	
public static String reverseString(String input){
	if ( input == null){
		return null;
	}
	
	char[] charArray = input.toCharArray();
	int left = 0;
	int right = charArray.length - 1;
	
	while ( left < right ){
		char temp = charArray[left];
		charArray[left] = charArray[right];
		charArray[right] = temp;
		left++;
		right--;
		
	}
	
	return new String(charArray);
	
}
	
	public static void main(String[] args){
		String originalString = "Hello, World!";
		String reversedString = reverseString(originalString);
		
		System.out.println("Original String : " + originalString);
		System.out.println("Reversed String : " + reversedString);
	}
	
}