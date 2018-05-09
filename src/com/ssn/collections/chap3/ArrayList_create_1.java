package com.ssn.collections.chap3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// different ways to create array list
public class ArrayList_create_1 {

	public static void main(String[] args) {
		
		
		
		//{{method:1 Arrays.asList
			
			ArrayList<String> days1 = new ArrayList<String>(
													Arrays.asList(
																"Monday",
																"Tuesday",
																"Wednesday",
																"Thursday",
																"Friday",
																"Saturday",
																"Sunday")
													);
			//System.out.println("days1 are:" + days1);
		//}}
			
		//{{Method 2: Anonymous inner class method
			ArrayList<String> cities = new ArrayList<String>() {
				{
					add("Delhi");
					add("Agra");
					add("Chennai");
					add("Bangalore");
				}
			};
			//System.out.println("cities ->"+cities);
			
		//}}
		
		//{{Method3: Normal way of ArrayList initialization
			
			ArrayList<String> books = new ArrayList<String>();
			books.add("Java101 by syed");
			books.add("Advance Java 201 by syed");
			books.add("UI for java developers by syed");
			books.add("Design pattrens in java by syed");
			books.add("Design pattrens in java by syed");
			//System.out.println("Books in store are  : " + books);
		//}}		
	
		//{{ //3 array TO Array List
				String[] planets = {"Mercury","Venus","Earth", "Mars", "Jupiter","Saturn","Uranus","Neptune"};
				ArrayList<String> planetsArrayList = new ArrayList<String>(Arrays.asList(planets));
				//System.out.println("Class name of planetsArrayList -> "+planetsArrayList.getClass().getName() ); // display class name 
				/////////////4 sorting
			//	System.out.println("Before sorting "+planetsArrayList ); // before sorting
				//Collections.sort(planetsArrayList);
				//Collections.sort( planetsArrayList, Collections.reverseOrder()); // sorting reverse order
			//	System.out.println("After sorting"+planetsArrayList ); 
		//}}
				
				
		//{{
			
				ArrayList<Date> listDates = new ArrayList<Date>();
				DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

				try {
					listDates.add(dateFormatter.parse("2018-09-30"));
					listDates.add(dateFormatter.parse("2018-07-06"));
					listDates.add(dateFormatter.parse("2018-11-28"));
				} catch (ParseException ex) {
					System.err.print(ex);
				}

				System.out.println("Before sorting: " + listDates);

				//Collections.sort(listDates);
				Collections.sort( listDates, Collections.reverseOrder()); // sorting reverse order
				System.out.println("After sorting: " + listDates);
	   //}}
	}

}
