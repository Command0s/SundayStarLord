package com.upskill.assignment_2;

public class Assignment_2_8 {
	
	public static void main (String[] args){
		
		int n = 7;
		int factorial = 1;
		
		for (int i = 1; i <= n; i++){
			
			factorial *= i;
			
			}
		
		System.out.println("Factorial of " + n + " is " + factorial);
	}

	
}