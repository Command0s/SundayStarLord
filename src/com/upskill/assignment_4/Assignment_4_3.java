package com.upskill.assignment_4;

import java.util.HashMap;

public class Assignment_4_3 {
	
public static int countDuplicates(int[] array){
	
	HashMap<Integer, Integer> elementCount = new HashMap<>();
	
	for(int element : array ){
		elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
	}
	
	int duplicateCount = 0;
	
	for(int count : elementCount.values()){
		if (count > 1){
			duplicateCount++;
		}
	}
	
	return duplicateCount;
}
	
	public static void main(String[] args){
		
		int[] array = {1,4,5,6,7,8,8,6,5,4,3,3,2,2,4,5,6,7,8};
		int duplicateCount = countDuplicates(array);
		
		System.out.println("Number of duplicate values : " + duplicateCount);
	}
	
}