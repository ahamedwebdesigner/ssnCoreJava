package com.ssn.enumtest;


enum Days {
	 SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
}

// Declaring enum in same class file
public class EnumEG_1A {
	public static void main(String[] args) {
		for (Days s : Days.values())  
			System.out.println(s);  
	}
}
