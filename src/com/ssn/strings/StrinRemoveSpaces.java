package com.ssn.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrinRemoveSpaces {

	 public static String removeWhite(String s) {
	     
	        // Creating a pattern for whitespaces
	        Pattern patt = Pattern.compile("[\\s]");
	 
	        // Searching patt in s.
	        Matcher mat = patt.matcher(s);
	 
	        // Replacing
	        return mat.replaceAll("");
	   }
	
	public static void main(String[] args) {
		
		 String s = "Hello  Everyone      .    Welcome     " + 
                 "to Geeks for Geeks.";
      System.out.println(removeWhite(s));
	}

}
