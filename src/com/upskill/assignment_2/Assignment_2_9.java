package com.upskill.assignment_2;

public class Assignment_2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "Talen";
		String second = "Tech";
		
		System.out.println("Before Swapping: ");
		System.out.println("First String = " + first);
		System.out.println("Second String = " + second);
		
		String temp = first;
		first = second;
		second = temp;
		
		System.out.println("After Swapping: ");
		
		System.out.println("First string = " + first);
		System.out.println("Second String = " + second);

	}

}
