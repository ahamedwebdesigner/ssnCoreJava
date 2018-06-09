package com.ssn.temporals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Temporal4 {

	public static void main(String[] args) {
		
		// 1
				LocalDateTime today = LocalDateTime.now();
				//System.out.println(today);   //2017-05-04T10:40:46.909
				
		//2
				//System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
			
				//3 
				//System.out.println(LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30));
						
				//4 invalied date 
				//System.out.println(LocalDateTime.of(2014, Month.FEBRUARY, 28, 25,1,1));// java.time.DateTimeException
				
				//5 with zoneId
				
				//System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
				//System.out.println(LocalDateTime.now(ZoneId.of("America/Anchorage")));
				
				//java.time.zone.ZoneRulesException
				//System.out.println(LocalDateTime.now(ZoneId.of("America/Anchor")));

				//10000th second time from 01/01/1970
				//System.out.println(	LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC));
				
				//* LocalDateTime from LocalDate
				
				LocalDate thisday = LocalDate.now();
				//System.out.println(thisday.atTime(LocalTime.now()));
				
				/*
				System.out.printf("now (from Instant): %s%n",
		                LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
				
				System.out.printf("6 months from now: %s%n",
		                LocalDateTime.now().plusMonths(6));

				System.out.printf("6 months ago: %s%n",
				                LocalDateTime.now().minusMonths(6)); */
				
				Instant timestamp = Instant.now();
				System.out.println(timestamp); //2017-05-04T05:19:14.564Z
				
				System.out.println(timestamp.toEpochMilli()); //1493875272743
				System.out.println(Instant.ofEpochMilli(timestamp.toEpochMilli()));// 2017-05-04T05:21:53.990Z
		
		
	}

}
