package com.upskill.assignment_4;

public class Assignment_4_4 {
	
	public static boolean isLeapYear(int year){
		
		if (year % 4 == 0){
			if(year % 100 == 0 ){
				return year % 400 == 0;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		int year = 2030;
		boolean leapYear = isLeapYear(year);
		
		System.out.println(year + " is a leap year : " + leapYear);

	}

}
