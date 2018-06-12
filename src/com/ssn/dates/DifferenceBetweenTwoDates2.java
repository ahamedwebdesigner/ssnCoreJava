package com.ssn.dates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenTwoDates2 {

	//Joda Time Example
	public static void main(String[] args) throws ParseException {
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String ActualDate = "2018-06-15";
	    
	    LocalDate dt = LocalDate.parse(ActualDate, formatter);
	    
	    LocalDate currentdate = LocalDate.now();
	    
	    Period period = Period.between(dt, currentdate);
	    System.out.println("Years " + period.getYears());  //Years 2
	    System.out.println("Months " + period.getMonths()); //Months 1
	    System.out.println("Days " + period.getDays()); //Days 11

	}

}
