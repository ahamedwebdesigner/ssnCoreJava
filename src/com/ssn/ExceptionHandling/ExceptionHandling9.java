package com.ssn.ExceptionHandling;

import java.util.Scanner;


class DivideByZeroException extends Exception{
  public DivideByZeroException( ){
    super("Dividing by Zero!");
  }
  public DivideByZeroException(String message){
    super(message);
  }
}



//Programmer-defined Exception Classes
public class ExceptionHandling9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the divisor: ");
	    int divisor = sc.nextInt();

	    try {
	      if (divisor == 0)
	        throw new DivideByZeroException("From App: User entered a zero!");

	      System.out.println("Result: " + (10/divisor));
	    }
	    catch(DivideByZeroException e) {
	      System.out.println(e.getMessage());
	    }

	    System.out.println("End of the program");
		  
	}
}

