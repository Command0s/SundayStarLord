package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
		practiceInfiniteLoop();
		

	}
	
	public static void practiceForLoop(){
		int i;
		for (i = 1; i <= 100; i++){
				System.out.println("For Loops number = " + i );
		}
	}
	
	public static void practiceWhileLoop(){
		int i = 1;
		while (i<=10){
			System.out.println("While Loops number : " + i);
			i++;
		}
	}
	
	public static void practiceDoWhileLoop(){
		int i = 1;
		do {
			System.out.println("Do While Loops number = " + i);
			i++;
		} while (i<=0);
		
	}
	
	public static void practiceInfiniteLoop(){
		int i;
		for (i = 1; ; i++){
			System.out.println("Infinite For loop number = " + i);
			
		}
	}
	
	

}
