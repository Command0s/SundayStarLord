package com.upskill.assignment_2;

public class Assignment_2_7 {
	public static void main (String[] args){
		
		int a = 25;
		int b = 30;
		
		System.out.println("Before Swapping: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int temp = a;
		a = b;
		b = a;
		
		System.out.println("After Swapping: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}