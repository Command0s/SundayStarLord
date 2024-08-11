package com.upskill.java_1;

public class MethodType {

	
	/*
	 * Types of method
	 * 
	 * 1. void method
	 * 2. static method
	 * 3. return type method
	 * 
	 */
	
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weeklyIncomeStatic();
		MethodType MethodTypeObj = new MethodType(); // classname objectname = new objectname();
		MethodTypeObj.annualIncomeVoid();
		System.out.println("My Monthly Income = " + MethodTypeObj.monthlyIncomeReturn());

	}
	
	//void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
		
	}
	
	//return method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
		
	}
	
	//static method
	public void weeklyIncomeStatic(){
		
		int calculateWeeklyIncome =  hourlyIncome * 40;
		System.out.println("My weekly income = " + calculateWeeklyIncome);
	}
	

}
