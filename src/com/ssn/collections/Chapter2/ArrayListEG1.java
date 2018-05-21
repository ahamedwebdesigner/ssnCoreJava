package com.ssn.collections.Chapter2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/*
 * 1) creating arrayList with various in built data types 
 * 2) using sort method form collections to sort
 */
public class ArrayListEG1 {

	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////
		//                Creating ArrayList
		////////////////////////////////////////////////////////////////////
		
		//1) A1) create ArrayList  Of string simple way
		ArrayList<String> vegBasket = new ArrayList();
		vegBasket.add("Bitter Gourd");
		vegBasket.add("Bottle Gourd");
		vegBasket.add("Cabbage ");
		vegBasket.add("Capsicum ");
		vegBasket.add("Carrot ");
		System.out.println("vegBasket -> : " + vegBasket);
		
		//2) A2) ArrayList of Integers using constructor way
		ArrayList<Integer> DayTemperature = new ArrayList<Integer>() {
			{
				add(32);
				add(40);
				add(26);
				add(28);
				add(30);
			}
		};
		System.out.println("DayTemperature ->"+DayTemperature);
		
		//3) A3) using array to Array List
		String[] planets = {"Mercury","Venus","Earth", "Mars", "Jupiter","Saturn","Uranus","Neptune"};
		ArrayList<String> planetsArrayList = new ArrayList<String>(Arrays.asList(planets));
		System.out.println("planets -> " + planetsArrayList);
		
		
		//4) A4)  ArrayList of Dates
		ArrayList<Date> listDates = new ArrayList<Date>();
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

		try {
			listDates.add(dateFormatter.parse("2018-09-30"));
			listDates.add(dateFormatter.parse("2018-07-06"));
			listDates.add(dateFormatter.parse("2018-11-28"));
		} catch (ParseException ex) {
			System.err.print(ex);
		}
		System.out.println("listDates: " + listDates);
		
		
		////////////////////////////////////////////////////////////////////
		//               sorting Array List using Sort
		////////////////////////////////////////////////////////////////////
		
		
		System.out.println("=================sort by natureal order =============\n");
		
		Collections.sort(vegBasket);  // sorting by natural order
		Collections.sort(DayTemperature);  // sorting by natural order
		Collections.sort(planetsArrayList);  // sorting by natural order
		Collections.sort(listDates);  // sorting by natural order
		
		System.out.println("DayTemperature ->"+DayTemperature);
		System.out.println("vegBasket -> : " + vegBasket);
		System.out.println("planets -> " + planetsArrayList);
		System.out.println("listDates: " + listDates);
		
		System.out.println("=================sort by Reverse order order =============\n");
		
		//i) using sort method and passing comparato
		//vegBasket.sort(Collections.reverseOrder()); 
		
		Collections.sort(vegBasket, Collections.reverseOrder());  // sorting by natural order
		Collections.sort(DayTemperature, Collections.reverseOrder());  // sorting by natural order
		Collections.sort(planetsArrayList, Collections.reverseOrder());  // sorting by natural order
		Collections.sort(listDates,Collections.reverseOrder());  // sorting by natural order
		
		
		System.out.println("DayTemperature ->"+DayTemperature);
		System.out.println("vegBasket -> : " + vegBasket);
		System.out.println("planets -> " + planetsArrayList);
		System.out.println("listDates: " + listDates);
	}

}
