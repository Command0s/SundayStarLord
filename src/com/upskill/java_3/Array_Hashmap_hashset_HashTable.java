package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_hashset_HashTable {

	public static void main(String[] args) {
		
/*		int age = 30;
		int[] ageStarLord = new int[]{25, 30, 45, 300};
		String[] namesStarLord = new String[]{"Naeem", "Tareq", "Hasan", "Danish"};
		
	
		
		System.out.println("Student Age : " + ageStarLord[3]);
		System.out.println("Total Student : " + ageStarLord.length);
		
		System.out.println("Student Name : " + namesStarLord[3]);
		System.out.println("Total Student : " + namesStarLord.length);
		
		for(int i = 0; i < namesStarLord.length; i++ ){
			System.out.print(namesStarLord[i] + " ");
		}
		

		
		int [][] ageStarLord2d = {{23, 232, 234, 255},{52,121,14,5,221}};
		String[][] namesStarLord2d = {{"Naeem", "Tareq", "Hasan", "Danish"},{"Siful", "Mohaimin", "Rozony"}};
		System.out.println("Student age : " + ageStarLord2d[1][1]);
		System.out.println("Student name :" + namesStarLord2d[1][2]);
		
		for(i = 0; i < ageStarLord2d.length; i++ ){
			System.out.println("Students Age" + ageStarLord2d[i][i]);
		}
*/		
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		Student.put("Pavel" , 23);
		Student.put("Rasel", 27);
		
		System.out.println("Student Age: " + Student.get("Rasel"));
		
		
		HashMap<String, String> Province = new HashMap<String, String>();
		Province.put("Toronto", "Ontario");
		Province.put("Halifax", "Nova Scotia");
		
		System.out.println("Province Name : " + Province.get("Toronto"));
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		Region.put("Sri Lanka", "South Asia");
		
		System.out.println("Region: " + Region.get("BD"));
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Ford");
		car.add("Mahindra");
		car.add("Audi");
		
		System.out.println("Car : " + car);
		
		
		
	
		
		
		
		

	}

}
