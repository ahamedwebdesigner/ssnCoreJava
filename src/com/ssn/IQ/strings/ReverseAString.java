package com.ssn.IQ.strings;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "syed Mustaq Ahamed";
		 
	    //----------------1 char array
		//1. convert string in to char array
		//2. loop form end
		char[] strArray = str.toCharArray();
		 
		for (int i = strArray.length - 1; i >= 0; i--){
		    System.out.print(strArray[i]);    
		}
		System.out.println();
		//----------------2 using string buffer
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse());
		
		//-----------------3 recursiveMethod
		System.out.println(recursiveMethod(str));
	}
	
	
	// 
	static String recursiveMethod(String str){
	     if ((null == str) || (str.length() <= 1)) {
	            return str;
	     }
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}
