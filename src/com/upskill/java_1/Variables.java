package com.upskill.java_1;

public class Variables {

	
	static String country = "USA";
	
	static String region = "America";
	
	public static void main(String[] args) {
		String city = "New york";
		michigan("Wayne");
		texas("Anderson");

	}
	
	public static void texas(String county){
		
		String city = "Dallas";
		String mycounty = county;
		System.out.println(city);
		System.out.println(mycounty);
		System.out.println(country);
		
	}
	
	public static void michigan(String county){
		String city = "Detroit";
		String mycounty = county;
		System.out.println(city);
		System.out.println(mycounty);
		System.out.println(country);
		
	
		
	}

}
