package com.upskill.assignment_3;

//Base class
class Bank {
 // Method to get interest rate
 double getInterestRate() {
     return 0.0;
 }
}

//Chase bank class
class Chase extends Bank {
 // Overriding the getInterestRate method
 @Override
 double getInterestRate() {
     return 8.0;
 }
}

//City bank class
class City extends Bank {
 // Overriding the getInterestRate method
 @Override
 double getInterestRate() {
     return 7.0;
 }
}

//TD bank class
class TD extends Bank {
 // Overriding the getInterestRate method
 @Override
 double getInterestRate() {
     return 9.0;
 }
}

public class Assignment_3_3 {
 public static void main(String[] args) {
     // Creating bank objects
     Bank chase = new Chase();
     Bank city = new City();
     Bank td = new TD();

     // Displaying interest rates
     System.out.println("Chase Bank Interest Rate: " + chase.getInterestRate() + "%");
     System.out.println("City Bank Interest Rate: " + city.getInterestRate() + "%");
     System.out.println("TD Bank Interest Rate: " + td.getInterestRate() + "%");
 }
}
