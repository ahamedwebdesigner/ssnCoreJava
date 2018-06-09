package com.ssn.temporals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Temporal6 {

	public static void main(String[] args) {
		
		//6 Comparing Dates
		java.util.Date date1 = new java.util.Date();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		java.util.Date date2 = new java.util.Date();
//		
/*		System.out.println(date1);
  	    System.out.println(date2);
		System.out.println(date1.compareTo(date2));
		System.out.println(date2.compareTo(date1));*/
//		
//		//7 comparison methods
		System.out.println( date1.before(date2));
		System.out.println( date1.after (date2));
		System.out.println( date2.after (date1));
		
		
	}

}
