package com.ssn.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling3 {

	
	// Throwing custom exception with message 
	//
	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the divisor: ");
		   
		  
		    
		    try {
		    	
		    	// check for int 
		    	if(!sc.hasNextInt()) {
		    		throw new ArithmeticException("Entered Character instead of number!");
		    	}
		    	
		    	int divisor = sc.nextInt();
		    	
		    	if(divisor == 0) {
		    		throw new Exception("User entered a zero!");
		    	}


		        int bad = 10/divisor; // ArithmeticException occurs
		        // Rest of the try section is not executed.
		        System.out.println("Line after error Not outputed If there is exception above."); 
		      }
		      catch(ArithmeticException e) {
		    	  System.out.println("** Exception is caught: " +  e.getMessage());
		       
		      } catch (Exception e) {
		    	  System.out.println("** Exception is caught: " +  e.getMessage());
				e.printStackTrace();
			}

		    
		    // After catch, the program execution continues.
		    System.out.println("End of the program"); 

	}

}
