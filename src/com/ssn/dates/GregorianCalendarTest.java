package com.ssn.dates;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {

	public static void main(String[] args) {
		Calendar cal1 = new GregorianCalendar();  				// allocate an instance and upcast to Calendar
		Calendar cal2 = new GregorianCalendar(2010, 9, 26);     // allocate with the specified date
		System.out.println(cal2.get(Calendar.DAY_OF_WEEK));                       // 1 (Sunday) to 7 (Saturday)
	
	}

}
