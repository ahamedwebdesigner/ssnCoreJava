package com.ssn.IQ;

public class DetermineCharacter {

	//#Q  How to determine characetr or digit entered in 
	public static void main(String[] args) {
	
		 System.out.println(Character.isLetter('A')); 
		 System.out.println(Character.isLetter('0')); 
		 
		 // print false as A is character
	     System.out.println(Character.isDigit('A')); 
	     System.out.println(Character.isDigit('0'));
	     
	     
	     	System.out.println(Character.isWhitespace('A')); 
	        System.out.println(Character.isWhitespace(' ')); 
	        System.out.println(Character.isWhitespace('\n')); 
	        System.out.println(Character.isWhitespace('\t')); 
	         
	        
	        System.out.println(Character.isWhitespace(9)); //ASCII value of tab
	        System.out.println(Character.isWhitespace('9')); 
	        
	        
	        System.out.println(Character.isUpperCase('A'));
	        System.out.println(Character.isUpperCase('a'));
	        System.out.println(Character.isUpperCase(65));  //true
	        
	        
	        System.out.println(Character.toString('x')); 
	        System.out.println(Character.toString('Y')); 
	        
	        // escap sequences
	        System.out.println("She said \"Hello!\" to me.");
	        
	        
	        
	        
	}

}
