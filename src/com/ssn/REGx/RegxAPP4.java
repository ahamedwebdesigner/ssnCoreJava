package com.ssn.REGx;

public class RegxAPP4 {

	public static void main(String[] args) {
		String test = "http://yahoo.com";
		 System.out.println(test.matches("^(http|https|ftp)://.*$"));
	}

}
