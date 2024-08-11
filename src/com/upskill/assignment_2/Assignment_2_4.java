package com.upskill.assignment_2;

public class Assignment_2_4 {

	public static void main(String[] args) {
		doubleForLoop();

	}
	
	public static void doubleForLoop(){
		
		int i;
		
		for (i = 1; i <= 500; i = i * 2 ){
			System.out.println("Doubles = " + i);
		}
	}

}
