package com.upskill.java_4;

public class Encapsulation {
    
    // Private fields
    private String name = "Upskill";
    private int ssn = 73497432;
    private String username = "hasan";
    private String street = "50 wellsley ave";
    private int dob = 12121991;
    private int dl = 3473437;
    
    // Setter method - name
    public void setName(String value) {
        name = value;
    }
    
    // Getter Method - name
    public String getName() {
        return name;
    }
    
    // Setter method - SSN
    public void setSSN(int value) {
        ssn = value;
    }
    
    // Getter method - SSN
    public int getSSN() {
        return ssn;
    }
    
    // Setter method - username
    public void setUserName(String value) {
        username = value;
    }
    
    // Getter method - username
    public String getUserName() {
        return username;
    }
    
    // Setter method - street
    public void setStreet(String value) {
        street = value;
    }
    
    // Getter method - street
    public String getStreet() {
        return street;
    }
    
    // Setter method - DOB
    public void setDOB(int value) {
        dob = value;
    }
    
    // Getter method - DOB
    public int getDOB() {
        return dob;
    }
    
    // Setter method - DL
    public void setDL(int value) {
        dl = value;
    }
    
    // Getter method - DL
    public int getDL() {
        return dl;
    }

    // Main method to display the user information
    public static void main(String[] args) {
        // Create an instance of the Encapsulation class
        Encapsulation user = new Encapsulation();
        
        // Display the user information
        System.out.println("Name: " + user.getName());
        System.out.println("SSN: " + user.getSSN());
        System.out.println("Username: " + user.getUserName());
        System.out.println("Street: " + user.getStreet());
        System.out.println("DOB: " + user.getDOB());
        System.out.println("DL: " + user.getDL());
    }
}
