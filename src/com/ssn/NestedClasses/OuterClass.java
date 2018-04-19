package com.ssn.NestedClasses;

public class OuterClass {

	static int outer_x = 10;

	// instance public
	int outer_y = 20;

	// private member
	private static int outer_private = 30;
	
	
	 static class StaticNestedInner{
		 void display(){
	            // can access static member of outer class
	            System.out.println("outer_x = " + outer_x);
	             
	            // can access display private static member of outer class
	            System.out.println("outer_private = " + outer_private);
	             
	            // The following statement will give compilation error
	            // as static nested class cannot directly access non-static membera
	            // System.out.println("outer_y = " + outer_y);
	         
	        }
	 }
	
	
	
	

}
