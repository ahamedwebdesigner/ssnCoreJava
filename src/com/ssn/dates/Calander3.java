package com.ssn.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Calander3 {

	public static void main(String[] args) {
		  String[] monthName = {"January", "February",
	                "March", "April", "May", "June", "July",
	                "August", "September", "October", "November",
	                "December"};

	        Calendar cal = Calendar.getInstance();
	        String month = monthName[cal.get(Calendar.MONTH)];
	        
	        System.out.println("Month name: " + month);
	        System.out.println("Month Index: " + cal.get(Calendar.MONTH));
	        
	        
	        
	     
	    
	        
	   
	}

}
