package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{


	public static void main(String[] args) {
		car();
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		
		Polymorphism obj1 = new Polymorphism();
		obj1.weeklyIncomeStatic();
		

	}
	
	public void weeklyIncomeStatic(){
		
		int calculateWeeklyIncome =  hourlyIncome * 45 ;
		System.out.println("My weekly income : " + calculateWeeklyIncome);
		
	}
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int RentalIncome = 40000;
		int SideIncome = 40000;
		int SecondJob = 120000;
		int newIncome = calculateAnnualIncome + RentalIncome + SideIncome + SecondJob;
		System.out.println("My Annual Income : " + newIncome);
	}
	
	
	
	
	
	
	
	
	public static void car(){
		System.out.println("My car is Civic");
	}
	
	public static void car(String color){
		System.out.println("My car is : " + color);
	}
	
	public static void car(int seat){
		System.out.println("My car has seat : " + seat);
		
	}
	
	public static void car(boolean fwd){
		System.out.println("My car is FWD : " + fwd);
		
	}
	
	public static void car(double top){
		System.out.println("The top speed is : " + top);
	}
	
	public static void car(char grade){
		System.out.println("I use oil grade : " + grade );
	}
	
	public static void car(String color, int seat){
		System.out.println("My Car is : " + color + " . It has seat : " + seat );
	}

}
