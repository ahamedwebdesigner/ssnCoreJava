package com.ssn.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Calander4 {

	public static void main(String[] args) {
		
			
	 	Calendar c = Calendar.getInstance();
	    Date v = c.getTime();
	 	
	 	System.out.println(
	 			
	 			c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH 
	 		));

	 	
	 	System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.FRANCE ) );
	 	System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("hi", "IN") ) );
	 	System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("tel", "IN") ) );
	    
	    System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("ar", "SY") ) );
	    System.out.println(c.getTime().toString());
//	    
//	    
//		    
	    Calendar cal = Calendar.getInstance();
	     System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));
//	     
    
	     // Localization support for date
	     Date d = new Date();
	     Locale saudi = new Locale("ar","SA");

	     Formatter formatter = new Formatter(System.out,Locale.FRENCH);
	     formatter.format("month: %tB\n", d);
	     
        System.out.printf(saudi, "month: %tB\n", d);
//	     

	}

}
