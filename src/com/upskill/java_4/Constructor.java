package com.upskill.java_4;

public class Constructor {
	
	String studentName;
	int studentAge;
	double studentBalance;
	char studentSection;
	
	public Constructor(String name){
		studentName = name;
	}
	
	public Constructor(int age){
		studentAge =  age;
	}
	
	public Constructor(double balance){
		studentBalance = balance;
	}
	
	public Constructor(char addy){
		studentSection = addy;
	}
	

	public static void main(String[] args) {
		Constructor obj = new Constructor("Pavel");
		System.out.println(obj.studentName);
		
		Constructor obj1 = new Constructor(25);
		System.out.println(obj1.studentAge);
		
		Constructor obj2 = new Constructor(1001.11);
		System.out.println(obj2.studentBalance);
		
		Constructor obj3 = new Constructor('A');
		System.out.println(obj3.studentSection);

	}

}
