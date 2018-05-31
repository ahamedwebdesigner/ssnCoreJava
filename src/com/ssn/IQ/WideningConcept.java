package com.ssn.IQ;

public class WideningConcept {

	public static void main(String[] args) {
		
		//When we use double quotes, the text is treated as a string and “YO” is printed, but when we use 
		//single quotes, the characters ‘L’ and ‘O’ are converted to int.
	/*	 System.out.print("Y" + "O");
	     System.out.print('L' + 'O'); 
	        */
	        
		
		// int -> float
/*		int number=10;
		float point=number;
		System.out.println(number);
		System.out.println(point);*/
		
		
		
	        
/*	        int number;
	    	float fval= 32.33f;
	    	number= (int)fval;
	    	System.out.println(number); // 32.33f -> 32
*/	    	
	    	
/*	    	double dval= 32.33;
	    	number= (int)dval;
	    	System.out.println(number); // 32.33 -> 32
*/	    	
	    	
		//float -> int
	    	
/*		float point=10.5f;
		//int a=f;//Compile time error
		int number=(int)point;
		System.out.println(point);
		System.out.println(number); 	*/
	    	
		
	    // int -> byte	
		//Overflow
		int number=150;
		byte b=(byte)number;
		System.out.println(number);
		System.out.println(b);	
		
		byte r=10;
		byte s=10;
		//byte c=r+s;//Compile Time Error: because r+s=20 will be int
		byte c=(byte)(r+s);
		System.out.println(c);
		
		

		
		
	}

}
