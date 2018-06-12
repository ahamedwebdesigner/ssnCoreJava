package com.ssn.dates;

import java.text.ParseException;
import java.time.LocalDateTime;

public class DifferenceBetweenTwoDates3 {

	//Java 8
	public static void main(String[] args) throws ParseException {
	
		//1 java.time.Period
	/*
		LocalDate endofCentury = LocalDate.of(2018, 06, 12);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(endofCentury, now);
		 
		System.out.printf("Difference is %d years, %d months and %d days old",
		                    diff.getYears(), diff.getMonths(), diff.getDays());
		*/
/*		// 2 ChronoUnit
	     LocalDate dateOfBirth = LocalDate.of(1980, Month.JULY, 4);
	     LocalDate currentDate = LocalDate.now();
	     
	     long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
	     long diffInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
	     long diffInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
	    
	     System.out.printf("Difference is %d years, %d months and %d days old",
					diffInYears, diffInMonths,diffInDays);
			*/
			
/*				// chronoUnit with time
			  LocalDateTime dateTime = LocalDateTime.of(1988, 7, 4, 0, 0);
			     LocalDateTime dateTime2 = LocalDateTime.now();
			     
		
			     
			     long diffInNano = ChronoUnit.NANOS.between(dateTime, dateTime2);
			     long diffInSeconds = ChronoUnit.SECONDS.between(dateTime, dateTime2);
			     long diffInMilli = ChronoUnit.MILLIS.between(dateTime, dateTime2);
			     long diffInMinutes = ChronoUnit.MINUTES.between(dateTime, dateTime2);
			     long diffInHours = ChronoUnit.HOURS.between(dateTime, dateTime2);
			     
			     System.out.printf("Difference is %d NANOS , %d SECONDS and %d MILLIS  and %d MINUTES  and %d HOURS old",
			    		 diffInNano, diffInSeconds,diffInMilli,diffInMinutes,diffInHours);*/
			     //Duration 
			     
/* */		  
		
			LocalDateTime dateTime = LocalDateTime.of(1988, 7, 4, 0, 0);
		     LocalDateTime dateTime2 = LocalDateTime.now();
		     
		    int diffInNano = java.time.Duration.between(dateTime, dateTime2).getNano();
		    
		     long diffInSeconds = java.time.Duration.between(dateTime, dateTime2).getSeconds();
		     long diffInMilli = java.time.Duration.between(dateTime, dateTime2).toMillis();
		     long diffInMinutes = java.time.Duration.between(dateTime, dateTime2).toMinutes();
		     long diffInHours = java.time.Duration.between(dateTime, dateTime2).toHours();
		     System.out.printf("Difference is %d NANOS , %d SECONDS and %d MILLIS  and %d MINUTES  and %d HOURS old",
		    		 diffInNano, diffInSeconds,diffInMilli,diffInMinutes,diffInHours);
		    
	}

}
