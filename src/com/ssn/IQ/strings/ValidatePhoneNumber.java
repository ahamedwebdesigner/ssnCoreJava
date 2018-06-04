package com.ssn.IQ.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {

	public static void main(String[] args) {
		
		
		//1. STRING.matches(regx) => true of flase
		//2. patren.compile -> matcher.match(string) -> t/f
		
/*	*/ //matches numbers only
		  String regexStr = "^[0-9]*$";
		  System.out.println("8538666004".matches(regexStr));

		
/*		//matches 10-digit numbers only
		String regexStr = "^[0-9]{10}$";
		System.out.println("8538666004".matches(regexStr)); // only 10 digits
		System.out.println("8538666003333".matches(regexStr));	
			*/
		
		//matches numbers and dashes, any order really.
/*		String regexStr = "^[0-9\\-]*$";
		System.out.println("8538666004".matches(regexStr)); // only 10 digits
		System.out.println("853866-003333".matches(regexStr));*/
		
/*		
		//matches 9999999999, 1-999-999-9999 and 999-999-9999
		String regexStr = "^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";
		System.out.println("8538666004".matches(regexStr)); // only 10 digits
		System.out.println("853866-003333".matches(regexStr));*/
				
		String number = "012-1234567";
		Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
		Matcher matcher = pattern.matcher(number); 
		 if (matcher.matches()) {
		      System.out.println("Phone Number Valid");
		 }	
	}

}
