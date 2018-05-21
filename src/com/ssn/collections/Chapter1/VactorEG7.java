package com.ssn.collections.Chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

// Convertions
public class VactorEG7 {

	public static void main(String[] args) {


		// Step1: Creating a Vector of String elements
	     Vector<String> AvengersVactor = new Vector<String>();
	 
	     // Step2: Populating Vector
	     AvengersVactor.add("Iron Man");
	     AvengersVactor.add("Thor");
	     AvengersVactor.add("Ant Man");
	     AvengersVactor.add("Wasp");
	     AvengersVactor.add("Hulk");
	 
	
	 
	    // Step3: Converting Vector to List
	    List<String> AvengersList = Collections.list(AvengersVactor.elements());
	    
	
	    // Step 4: Displaying List Elements
	    System.out.println("\nList Elements of : Avengers");
	    System.out.println("========================================\n");
	    for (String Avenger : AvengersVactor){
	       System.out.println(Avenger);
	    }
	    
	    //Converting Vector to ArrayList
	     ArrayList<String> AvengersArrayList= new ArrayList<String>(AvengersVactor);
	     
	     //Step 5: Displaying ArrayList Elements
	     System.out.println("\nArrayList Elements :");
	     System.out.println("========================================\n");
	     for (String s : AvengersArrayList){
	        System.out.println(s);
	     }
	     
	     //Step 6:convetring in to string of Array
	     
	     String[] Strarray = AvengersVactor.toArray(new String[AvengersVactor.size()]);
	     
	     //Step 7 :Displaying Converted array
	     
	     System.out.println("String Array Elements :");
	     System.out.println("========================================\n");
	     for(int i=0; i < Strarray.length ; i++){
	        System.out.println(Strarray[i]);
	     }

	}

}
