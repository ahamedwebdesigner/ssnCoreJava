package com.ssn.dates;

import java.util.Calendar;


//2) calender function examp;
public class Calender1 {

	public static void main(String[] args) {
		   Calendar cal = Calendar.getInstance();
		 
		  // System.out.println(cal);
		     
		   System.out.println("YEAR  : "+  		cal.get(Calendar.YEAR)    );
		   System.out.println("MONTH : "+  		cal.get(Calendar.MONTH)  );
		   System.out.println("DAY_OF_MONTH  : "+  cal.get(Calendar.DAY_OF_MONTH));
		   System.out.println("HOUR_OF_DAY  : "+  	cal.get(Calendar.HOUR_OF_DAY));
		   System.out.println("MINUTE  : "+  		cal.get(Calendar.MINUTE));
		   System.out.println("SECOND  : "+  		cal.get(Calendar.SECOND));
	
	}

}
