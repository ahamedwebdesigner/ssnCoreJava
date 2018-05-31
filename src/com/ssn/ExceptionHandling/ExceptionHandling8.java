package com.ssn.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the divisor: ");
		    int divisor = sc.nextInt();

		    try{
		      int result = doDivide(divisor); // might throw an exception
		      System.out.println("Result: " + result);
		    }
		    catch(Exception e) // exception thrown in doDivide() is caught here
		    {
		      System.out.println(e.getMessage());
		    }
		    
		    
		  }

		  public static int doDivide(int div) throws ArithmeticException{
		    if (div == 0)
		      throw new ArithmeticException("Divisor is zero!");

		    return (10/div);
		  }
		  
		  
	}
	

