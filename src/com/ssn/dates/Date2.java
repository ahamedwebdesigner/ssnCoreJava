package com.ssn.dates;
import java.text.SimpleDateFormat;
import java.util.Date;


//2) Formating dates string using String.formater
public class Date2 {

	public static void main(String[] args) {
		  // display time and date
	      String str = String.format("%tc", new Date());
	      System.out.printf(str);
	      
//	      // display time and date
//	      System.out.printf(" Today is : %1$s %2$tB %2$td, %2$tY", "Due date : ", new Date());
//

	      System.out.println( new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz").format(new Date()));
	      System.out.println( new SimpleDateFormat("EEEE, MMMM d, yyyy").format(new Date()));
	}

}
