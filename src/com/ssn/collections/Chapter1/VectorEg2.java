package com.ssn.collections.Chapter1;

import java.util.Enumeration;
import java.util.Vector;


/*
 * simple vactor example storin strings
 */
public class VectorEg2 {

	public static void main(String[] args) {
		Vector dayNames = new Vector();  //1 create element
		  dayNames.add("Sunday");         //2 add elements
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      //System.out.println(dayNames);  //output string form of vactor
	      								   //3 Remove elements
	      // dayNames.remove("Saturday");  //4 remvoe by name
	      dayNames.remove(6); 			   //5 remvoe by index ie 7th element saturday
	     
	      System.out.println(dayNames); 
	      dayNames.add(0,"Saturday");      	   //6 adding at 1st position
	      
	      System.out.println(dayNames);
	      System.out.println(dayNames.size()); //7 Display sthe size of the element
	   
	      
	      // Enumerators are used  for looping  through the vactor
	      Enumeration days = dayNames.elements();
	      while (days.hasMoreElements()) {
		         System.out.println(days.nextElement()); 
		      }
		}

}
