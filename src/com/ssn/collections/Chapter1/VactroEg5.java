package com.ssn.collections.Chapter1;

import java.util.List;
import java.util.Vector;


// Geth the sub list of from array list
public class VactroEg5 {
	
	
	
	public static void main(String[] args) {
		// Step 1: Create a Vector
	    Vector<String> vector = new Vector<String>();
	    
	    // Step 2: Add elements
	    vector.add("Item1");
	    vector.add("Item2");
	    vector.add("Item3");
	    vector.add("Item4");
	    vector.add("Item5");
	    vector.add("Item6");
	    
	    /* The method subList(int fromIndex, int toIndex) returns a List having elements of Vector 
	     * starting from index fromIndex  to (toIndex - 1).
	     *  
	     */
	    List subList = vector.subList(2,5); //index starts form 0 ie,. form 3rd element to 5th element
	 
	    
	    // Looping vactro using for loop
	    for(int i=0; i < subList.size() ; i++){
	       System.out.println(subList.get(i));
	    }
	    
	    
	}

}
