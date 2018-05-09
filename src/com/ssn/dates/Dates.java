package com.ssn.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
//1) date class
//2) date + simple date formater
//
public class Dates {

	public static void main(String[] args) {
		   // Date class
		   Date now = new Date();
		   System.out.println("toString(): " + now);  // dow mon dd hh:mm:ss zzz yyyy
		   
		   
		   
		   
		   
		   
		   //SimpleDateFormat can be used to control the date/time display format:
		 	   /*   
		   SimpleDateFormat dateFormatter1 = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
		   System.out.println("Format 1 : E, y-M-d 'at' h:m:s a z");
		   System.out.println("output 1:   " + dateFormatter1.format(now));
	     */
		   SimpleDateFormat dateFormatter2 = new SimpleDateFormat("yyyy-M-dd");
		   System.out.println("Format 2 : yyyy-M-dd");
		   System.out.println("output 2:   " + dateFormatter2.format(now));
		   
		   
		      
	}

}
