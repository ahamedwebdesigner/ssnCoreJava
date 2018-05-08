package com.ssn.collections.chap2;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		Vector dayNames = new Vector();
		  Enumeration days;
		// add
		 dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");


	      // print
	      System.out.println(dayNames);
	      //remove
	     // dayNames.remove("Saturday"); // remvoe by name
	      dayNames.remove(6); // remvoe by index
	      System.out.println(dayNames);
	      dayNames.add(0,"Saturday");
	      System.out.println(dayNames);
	      
	      System.out.println(dayNames.size());
	   
	      days = dayNames.elements();
	      while (days.hasMoreElements()) {
		         System.out.println(days.nextElement()); 
		      }


	}

}
