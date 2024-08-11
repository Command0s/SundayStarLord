package com.upskill.assignment_2;

public class Assignment_2_3 {
	
	static int a;
	static int b;

	public static void main(String[] args) {
		
		a = f1();
		b = f2();
		compare();
		

	}
	
	public static int f1(){
		return 99;
	}
	
	public static int f2(){
		return 101;
	}
	
	public static void compare(){
		if (a < b){
			System.out.println("Second Number is bigger");
		} if (a > b){
			System.out.println("First number is bigger");
		}
	}

}
