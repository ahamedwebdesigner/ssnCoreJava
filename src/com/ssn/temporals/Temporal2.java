package com.ssn.temporals;

import java.time.LocalTime;
import java.time.ZoneId;

public class Temporal2 {

	public static void main(String[] args) {
		
		// 1 localTime with now()
				LocalTime time = LocalTime.now();
				//System.out.println(time);
				
				// * invalied arguments
				//System.out.println(LocalTime.of(12,100)); //java.time.DateTimeException
//				System.out.println(LocalTime.of(12,20));
//				System.out.println(LocalTime.of(12,20,50));
//				System.out.println(LocalTime.of(12,20,25,40));
				
				//* 2 using zone id
				
		/**/		System.out.println(LocalTime.now(ZoneId.of("Asia/Kolkata")));
				    System.out.println(LocalTime.now(ZoneId.of("America/Anchorage")));
			
				
				
		
		
	}

}
