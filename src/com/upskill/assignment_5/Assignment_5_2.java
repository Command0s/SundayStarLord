package com.upskill.assignment_5;

public class Assignment_5_2 {
	
	
	public static String fizzbuzz(int number){
		
		if (number % 3 == 0 & number % 5 == 0){
			return "Fizzbuzz";
		} else if (number % 5 == 0){
			return "Buzz";
		} else if (number % 3 == 0){
			return "Fizz";
		} else {
			return String.valueOf(number);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(fizzbuzz(6));
		System.out.println(fizzbuzz(10));
		System.out.println(fizzbuzz(15));
		System.out.println(fizzbuzz(8));

	}

}
