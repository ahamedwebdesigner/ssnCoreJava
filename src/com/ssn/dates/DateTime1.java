package com.ssn.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTime1 {

	public static void main(String[] args) {
		//1) LocalDate
		LocalDate date = LocalDate.now();  
	    
	    System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+ date.minusDays(1));  
	    System.out.println("Tommorow date: "+ date.plusDays(1));  
	    System.out.println("Tommorow date: "+ date.plus(1,ChronoUnit.DAYS));  
	    
	    System.out.println("======================");
	    System.out.println("Today date: "+date.plusYears(2).isLeapYear());  
	    //
	    LocalDate date1 = LocalDate.of(2017, 1, 13);  
	    System.out.println( "date1 is LeapYear :" + date1.isLeapYear());  
	    LocalDate date2 = LocalDate.of(2016, 9, 23);  
	    System.out.println("date2 is LeapYear :" + date2.isLeapYear());  

	}

}
