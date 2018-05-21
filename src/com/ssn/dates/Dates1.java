package com.ssn.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
//1) date class
//2) date + simple date formater
// If there is not date manipulations wecan use date
public class Dates1 {

	public static void main(String[] args) {
		   // i) Date class and output directly 
			Date now = new Date();
		   System.out.println("toString(): " + now);  // dow mon dd hh:mm:ss zzz yyyy
		  
		   //ii) use simple date formater to print the date string 
		   SimpleDateFormat dateFormatter1 = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
		   System.out.println("Format 1 : E, y-M-d 'at' h:m:s a z");
		   System.out.println("output 1:   " + dateFormatter1.format(now));
		     
		   //iii) 
		   SimpleDateFormat dateFormatter2 = new SimpleDateFormat("yyyy-M-dd");
		   System.out.println("Format 2 : yyyy-M-dd");
		   System.out.println("output 2:   " + dateFormatter2.format(now));
		         
	}

}
