package com.upskill.assignment_3;

//Base class
class BankAccount {
 protected String accountName;
 protected double balance;

 // Constructor
 public BankAccount(String accountName, double initialAmount) {
     this.accountName = accountName;
     this.balance = initialAmount;
 }

 // Method to make a deposit
 public void deposit(double amount) {
     balance += amount;
 }

 // Method to make a withdrawal
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
     } else {
         System.out.println("Insufficient balance!");
     }
 }

 // Method to display account information
 public void displayAccountInfo() {
     System.out.println("Account name: " + accountName);
     System.out.println("Balance: " + balance);
 }
}

//SavingsAccount subclass
class SavingsAccount extends BankAccount {
 public SavingsAccount(double initialAmount) {
     super("Savings", initialAmount);
 }
}

//CheckingAccount subclass
class CheckingAccount extends BankAccount {
 public CheckingAccount(double initialAmount) {
     super("Checking", initialAmount);
 }
}

public class Assignment_3_1 {
 public static void main(String[] args) {
     // Creating a Savings account with initial amount 10000
     SavingsAccount savings = new SavingsAccount(10000);
     savings.displayAccountInfo();

     // Making a deposit of 5000 in Savings account
     savings.deposit(5000);
     System.out.println("New amount after deposit: " + savings.balance);

     // Creating a Checking account with initial amount 20000
     CheckingAccount checking = new CheckingAccount(20000);
     checking.displayAccountInfo();

     // Making a deposit of 6000 in Checking account
     checking.deposit(6000);
     System.out.println("New amount after deposit: " + checking.balance);

     // Making a withdrawal of 3000 from Checking account
     checking.withdraw(3000);
     System.out.println("New amount after withdrawal: " + checking.balance);
 }
}
