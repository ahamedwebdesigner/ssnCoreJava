package com.ssn.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling01 {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the divisor: ");
		    int divisor = sc.nextInt();
		  
		    System.out.println(divisor);
		    System.out.println("Result: " + (10/divisor));
		    
		    // After catch, the program execution continues.
		    System.out.println("********End of the program************"); 

	}

}
