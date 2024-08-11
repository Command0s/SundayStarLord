package com.upskill.assignment_2;

public class Assignment_2_5 {

	public static void main(String[] args) {
		multiply();

	}
	
	public static void multiply(){
		int i;
		int j;
		
		for (i = 1; i <= 8; i++){
			for (j = 1; j <= 8; j++){
				int multiplication = i * j;
				System.out.print(multiplication + " ");
			}
			
			System.out.println(" ");
		}
	}

}
