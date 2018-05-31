package com.ssn.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling7 {

	
	//The 'finally' clause is sometimes used to clean-up things after exceptions are caught.
	//The finally clause executes NO MATTER WHAT -- exception thrown or not thrown.
	//For that reason, a finally clause often contains code which does some clean-up, 
	//for instance re-setting values.

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter two numbers: ");
		    int x = sc.nextInt();
		    int y = sc.nextInt();

		    try {
		      // This line potentially throws an exception.
		      System.out.println("Quotient = " + (x/y));
		    }
		    catch(Exception e) {
		      System.out.println(e.getMessage());
		    }
		    finally {
		      System.out.println("*** in finally ***");
		    }
		    System.out.println("==== end of the program ===");
		      
		  }
	}


