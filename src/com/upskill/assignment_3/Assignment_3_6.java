package com.upskill.assignment_3;

public class Assignment_3_6 {
	
	public static void main (String[] args) {
		
		String input = "A quick brown fox jumps over the lazy dog";
		
		int vowels = 0;
		int con = 0;
		int spaces = 0;
		int tab = 0;
		int digits = 0;
		
		for (int i = 0; i < input.length(); i++ ){
			char ch = input.charAt(i);
			
			if (Character.isDigit(ch)){
				digits++;
			} else if (Character.isWhitespace(ch)){
				if (ch == '\t'){
					tab++;
				} else if (ch == ' '){
					spaces++;
				}
			} else if (Character.isLetter(ch)){
				ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
					vowels++;
				} else {
					con++;
				}
			}
		}
		
		System.out.println("Number of vowels are: " + vowels);
		System.out.println("Number of consonants are: " + con);
		System.out.println("Number of digits are: " + digits);
		System.out.println("Number of tabs are: " + tab);
		System.out.println("Number of blank spaces are: " + spaces);

	    }
	}