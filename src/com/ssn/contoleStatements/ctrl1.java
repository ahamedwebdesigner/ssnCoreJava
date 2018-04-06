package com.ssn.contoleStatements;

import java.util.Scanner;

public class ctrl1 {

	public static void main(String[] args) {
		int age;
		 Scanner inputDevice = new Scanner(System.in);  
		 System.out.print("Please enter Age: ");  
	       
		 age = inputDevice.nextInt();  
	        if(age > 18)  
	            System.out.println("above 18 "); 
	        else
	        	System.out.println("below 18 ");

	}

}
