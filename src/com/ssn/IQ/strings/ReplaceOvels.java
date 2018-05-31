package com.ssn.IQ.strings;

public class ReplaceOvels {

	
	//replace ovels in the given string
	public static void main(String[] args) {
		String inputString= "Hello";
		String output = inputString.replaceAll("[AEIOUaeiou]", "");
		System.out.println(output);

	}

}
