package com.ssn.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DifferenceBetweenTwoDates1 {

	public static void main(String[] args) throws ParseException {
	

		Date d1 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse("01/15/2017 10:31:48");
		Date d2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse("01/15/2018 10:31:49");
		//in milliseconds
		long diff = d2.getTime() - d1.getTime();


		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		long diffYears =diffDays/365;
		long monthes =diffDays/365;
		
		
		// in to days week and 

         long days = diff / (24 * 60 * 60 * 1000);
         long years=days/365;
         
         days=days%365;
         long months=days/30;
         
         days=days%30;
         long week =days/7;
         
         days=days%7;
         
         

		System.out.print(diffDays + " days, ");
		System.out.print(diffHours + " hours, ");
		System.out.print(diffMinutes + " minutes, ");
		System.out.print(diffSeconds + " seconds.");
		
		
		System.out.println();
/**/		System.out.print(diffYears + " years.");
	
		System.out.println();
		System.out.print( years + " years.");
		System.out.print( months+ " monthes.");
		System.out.print( week+ " week.");
		System.out.print( days+ " days.");

	}

}
