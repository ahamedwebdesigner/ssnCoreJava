package com.ssn.corejava;

public class stringEG4 {

	public static void main(String[] args) {

/*		s1.isEmpty()
		s1.trim()
		s1.toLowerCase()
		s1.toUpperCase()*/
		
		// isEmpty give true if the string is empty
		System.out.println(         "".isEmpty()      ); //=> true
		System.out.println(         "hellow".isEmpty()      ); //=> false
		
		
		//System.out.println("                 hellow".length());
		System.out.println("                 hellow".trim().length()); // to trim white spaces
		System.out.println("                 hellow        ".trim());
		
		// case conversion
		System.out.println("mustaq".toUpperCase());
		System.out.println("MUSTAQ".toLowerCase());
		
		
		
		System.out.println("hellow mustaq".replace("mustaq","syed"));
		
		System.out.println("hi there hellow all i am doing greate".contains("hellow"));
	
	}

}
