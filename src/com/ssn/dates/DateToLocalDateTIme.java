package com.ssn.dates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateToLocalDateTIme {

	public static void main(String[] args) {
/*		//Date to Instant
		Instant timestamp = new Date().toInstant();
		
		//Now we can convert Instant to LocalDateTime or other similar classes
		LocalDateTime date = LocalDateTime.ofInstant(timestamp, ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
		System.out.println(date);
*/
		
		//calender to localDateTime
		Instant timestamp = Calendar.getInstance().toInstant();
		
		//Now we can convert Instant to LocalDateTime or other similar classes
		LocalDateTime date = LocalDateTime.ofInstant(timestamp, ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
		System.out.println(date);
		
		// instance to date
		Date dt = Date.from(Instant.now());
	
		
		System.out.println(dt);
		System.out.println(Date.from(timestamp));
		
	}

}
