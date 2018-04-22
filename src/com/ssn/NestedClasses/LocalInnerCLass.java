package com.ssn.NestedClasses;

public class LocalInnerCLass {

	private String name ="syed";
	
	 public void getValue(){
		 final int sum = 200;
		 
	     class Inner {
	         public int divisor =20;
	     private int getQuotient()
	         {
	             System.out.println("Inside inner class " + name);
	             return sum / divisor;
	         }
	     }
	     
	     Inner inner = new Inner();
	     System.out.println(inner.getQuotient());
		 
	 }//----------------------------------------
	 
	 private void GetAnotherMethod() {
		
	 }
}
