package com.ssn.dates;

import java.util.Calendar;

public class Calander5 {

	public static void main(String[] args) {
		// Manipulating Dates
		  Calendar cal = Calendar.getInstance();   // GregorianCalendar
	      Calendar calTemp;
	      calTemp = (Calendar) cal.clone();
	      calTemp.add(Calendar.DAY_OF_YEAR, -365);
	      System.out.println("365 days ago, it was: " + calTemp.getTime());

	      // cloning the object
	      calTemp = (Calendar) cal.clone();
	      calTemp.add(Calendar.HOUR_OF_DAY, 11);
	      System.out.println("After 11 hours, it will be: " + calTemp.getTime());

	}

}
