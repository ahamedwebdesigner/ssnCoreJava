package com.ssn.collections.Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*
 * NOTE: 1) we can modity List elements using listTterater
 * 		 2) we can only remvove elemnts using iterator
 * 		 3) Iterating only perticular elements
 * 
 */
public class ArrayListEG6 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("FIRST");
        list.add("SECOND");
        list.add("THIRD");
        
        //0)
        // get the iterator form the 
        ListIterator<String> listIterator = list.listIterator();
        
        //1)
        // output the list befor output
        System.out.println(list);       //Output :    [FIRST, SECOND, THIRD]
        
        
        //2) 
        // modified elements with in the list
        while (listIterator.hasNext()){
            //Modifying an element returned by next()
            listIterator.set(listIterator.next()+" - Modified");
        }
        //3) 
        //output the list 
        System.out.println(list); //Output: [FIRST- Modified, SECOND- Modified, THIRD- Modified]
        
        
        //4) 
        // now get the Iterater instead of ListIterator
        
        String[] planets = {"Mercury","Venus","Earth", "Mars", "Jupiter","Saturn","Uranus","Neptune"};
		ArrayList<String> planetsArrayList = new ArrayList<String>(Arrays.asList(planets));
		
        Iterator<String> iterator = planetsArrayList.iterator();
        while (iterator.hasNext()){
        	if( iterator.next().equals("Earth")) {
            	  iterator.remove(); //Removing an element one by one
            } 
        }
        // 5) observe earth is removed
        System.out.println(planetsArrayList);    //Output : [Mercury, Venus, Mars, Jupiter, Saturn, Uranus, Neptune]
        
        
        ///////////////////////////////////////////////////
        //Looping through sprcific part
        ///////////////////////////////////////////////////
        
        String[] Continents  = {"Asia","Africa","North America","South America","Antarctica","Europe","Australia"};
		ArrayList<String> ContinentsList = new ArrayList<String>(Arrays.asList(Continents));
		
		ListIterator<String> ContinentsListIterator = ContinentsList.listIterator(2);
		// outputs form third element to the last
		while (ContinentsListIterator.hasNext()){
            System.out.println(ContinentsListIterator.nextIndex() +" : "+ContinentsListIterator.next());
        }
        
 	}

}
