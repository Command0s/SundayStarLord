package com.upskill.assignment_3;

//Employee class to store information about each employee
class Employee {
 String name;
 int age;
 double salary;
 String address;

 // Constructor to initialize the employee details
 public Employee(String name, int age, double salary, String address) {
     this.name = name;
     this.age = age;
     this.salary = salary;
     this.address = address;
 }

 // Method to display employee details
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Salary: " + salary);
     System.out.println("Address: " + address);
     System.out.println();
 }
}

public class Assignment_3_2 {
 public static void main(String[] args) {
     // Creating an array of 5 employees
     Employee[] employees = new Employee[5];

     // Initializing employee details
     employees[0] = new Employee("John Doe", 30, 50000, "123 Main St, Cityville");
     employees[1] = new Employee("Jane Smith", 25, 60000, "456 Elm St, Townsville");
     employees[2] = new Employee("Mike Johnson", 40, 70000, "789 Oak St, Villageville");
     employees[3] = new Employee("Emily Davis", 35, 80000, "101 Pine St, Hamletville");
     employees[4] = new Employee("David Wilson", 28, 55000, "202 Maple St, Boroughville");

     // Displaying employee details
     for (Employee emp : employees) {
         emp.displayInfo();
     }
 }
}
