package com.ssn.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the divisor: ");
		    int divisor = sc.nextInt();
		    try {
		        int bad = 10/divisor; // ArithmeticException occurs
		        // Rest of the try section is not executed.
		        System.out.println("Line after error Not outputed If there is exception above."); 
		      }
		      catch(Exception e) {
		    
		        System.out.println("** Exception is caught **");
		      }

		    
		    // After catch, the program execution continues.
		    System.out.println("End of the program"); 

	}

}
