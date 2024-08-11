package com.upskill.assignment_2;

import java.util.Scanner;

public class Assignment_2_10{

public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Farenheit: ");
	double farenheit = scanner.nextDouble();
	double celsius = (farenheit - 32) * 5 / 9;
	
	System.out.println("Converted Celsius: " + celsius);
	
}

}
