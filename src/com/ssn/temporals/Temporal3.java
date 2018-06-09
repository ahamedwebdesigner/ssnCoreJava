package com.ssn.temporals;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Temporal3 {

	public static void main(String[] args) {
		
		// 1
		//System.out.println(LocalDate.of(2001, Month.SEPTEMBER, 11));
		//System.out.println(LocalDate.now());
		
		// 2
		//System.out.println(LocalDate.of(2014, Month.FEBRUARY, 29));
		
		//* diffferent time zones
	/*	System.out.println(LocalDate.now(ZoneId.of("Asia/Kolkata")));
		System.out.println(LocalDate.now(ZoneId.of("America/Anchorage")));
		System.out.println(LocalDate.now(ZoneId.of("Pacific/Guadalcanal")));*/
		
		
		//* from epic date
	/*	System.out.println(LocalDate.ofEpochDay(365));//1971-01-01 one year form epic datege
		System.out.println(LocalDate.ofYearDay(2016, 100)); // 100th day of 2016
*/		
		
		LocalDate today = LocalDate.now();
		System.out.println("getYear "+today.getYear());
		System.out.println("getMonth "+today.getMonth());
		System.out.println("getMonthValue "+today.getMonthValue());
		
		System.out.println("getDayOfWeek "+today.getDayOfWeek());
		
		System.out.println("getDayOfMonth "+today.getDayOfMonth());
		System.out.println("getDayOfYear "+today.getDayOfYear());
		

		
		
		System.out.println("getChronology "+today.getChronology());
		
		
	}

}
