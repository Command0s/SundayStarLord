package com.upskill.assignment_4;

public class Assignment_4_1 {
	
	private String username = "hasan";
	private String password = "12556";
	private String email = "hasan@upskill.com";
	private String first = "Hasan";
	private String last = "Omi";
	
	public void print(){
		
		System.out.println("Username : " + username );
		System.out.println("Password : " + password );
		System.out.println("Email : " + email);
		System.out.println("First name : " + first);
		System.out.println("Last name : " + last);
	
	
	}
	
	
	public static void main(String[] args) {
		Assignment_4_1 obj = new Assignment_4_1();
		obj.print();
		

	}

}
