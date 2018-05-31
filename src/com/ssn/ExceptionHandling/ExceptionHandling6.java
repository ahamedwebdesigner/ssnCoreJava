package com.ssn.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling6 {

	
	// Different Tpe of exceptions

	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
		    int number;
		    String str;
		    boolean done = false; // initialized to false

		    do {
		      try
		      {
		        System.out.print("\nEnter an integer: ");

		        // The next line (nextInt()) may throw an exception
		        // of type InputMismatchException, if the user enters
		        // anything but an integer.  NOTE: In which case,
		        // the input value will NOT be read by nextInt().
		        number = console.nextInt();

		        // Fall through if an integer was correctly entered.
		        // Set the boolean variable to true so that the outer
		        // do-while loop terminates (by !done in the while-test).
		        done = true;

		        System.out.println("Number = " + number);
		      }
		      catch (InputMismatchException ime) {
		        // If the user enters a non-integer, the input value is
		        // still sitting in the 'console' to be read.
		        // Read it as a string (which works for any data type).
		        // Actually, you NEED to eat up or flush the bad input before
		        // the next input.  Reading as a string is one way.
		        str = console.next();

		        // Display the error.  toString() returns the full name
		        // of the exception class.
		        System.out.println("Exception: " + ime.toString() + " " + str);
		      }
		    } while (!done);

		    System.out.println("-- End of the program --");
		  }
	}


