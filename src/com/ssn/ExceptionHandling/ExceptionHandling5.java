package com.ssn.ExceptionHandling;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandling5 {

	
	// Different Tpe of exceptions

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		    try {
		      int [] anArray = {5,6,7};
		      System.out.print("Enter an index: ");
		      int index = sc.nextInt();  // might throw NoSuchElementException (in java.util)
		      int value = anArray[index];// might throw ArrayIndexOutOfBoundsException

		      System.out.println("The value is : " + anArray[index]);

		    }
		    catch (NoSuchElementException e) {
		      System.out.println(e.getMessage() + ": You must enter an int");
		    }
		    catch (ArrayIndexOutOfBoundsException e) {
		      System.out.println(e.getMessage() + ": Illegal index");
		    }

		    System.out.println("End of the program");
	}

}
