package com.ssn.temporals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Temporal1 {

	public static void main(String[] args) {

		// 1)print system date on console
		 System.out.println(new Date());
		

		 
			//2)date to string 
		
	/*		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
			String date = sdf.format(new Date());
			System.out.println(date); //10/1/2017
*/			
			
			//3)Get current date time
			/*
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
			*/
			
/*			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString = "31-08-1982 10:20:56";
			Date date = null;
			try {
				date = sdf.parse(dateInString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Date : "+ date);*/
			
			
		 System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", new Date());
		 System.out.println();
			// display formatted date
		      System.out.printf("%s %tB %<te, %<tY", "Due date:",  new Date());
	}

}
