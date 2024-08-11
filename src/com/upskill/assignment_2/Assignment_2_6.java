package com.upskill.assignment_2;

public class Assignment_2_6 {
    public static void main(String[] args) {
    	
    	for( int n = 1; n <= 100; n++ ){
    		
    		if(isPrime(n)){
    			
    			System.out.print(n + " ");
    		}
    	}
    		
    	}
    
    	public static boolean isPrime(int n){
    		if(n <= 1){
    			return false;
    		}
    		
    		for(int i = 2; i <= Math.sqrt(n); i++){
    			if( n % i == 0){
    				return false;
    			}
    		}
    		
    		return true;
    	}
    
    	
    
    
    }
