package com.upskill.assignment_5;

public class Assignment_5_3 {
	
	public static boolean isPalindrome(String word){
		
		int length = word.length();
		
		for ( int i = 0; i < length /2; i++){
			if ( word.charAt(i) != word.charAt(length - 1 - i)){
				return false;
			} 
			
		}
		
		return true;
			
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome("abcba"));
		System.out.println(isPalindrome("abcd"));

	}
	}
