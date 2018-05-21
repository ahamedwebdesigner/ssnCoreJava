package com.ssn.dates;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTime1 {

	public static void main(String[] args) {
		 LocalTime time = LocalTime.now();  
		    System.out.println(time);  
		    
		     LocalTime time1 = LocalTime.of(10,43,12);  
		     System.out.println(time1);  
		     
		     
		     ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
		     ZoneId zone2 = ZoneId.of("Asia/Tokyo");  

		     LocalTime time2 = LocalTime.now(zone1);  
		     System.out.println("India Time Zone: "+time2); 
		     
		     
		     LocalTime time3= LocalTime.now(zone2);  
		     System.out.println("Japan Time Zone: "+time3); 
		     
		  // howers between different time zones
		     long hours = ChronoUnit.HOURS.between(time1, time2);  
		     System.out.println("Hours between two Time Zone: "+hours);  
		     
		     
		     
	}

}
