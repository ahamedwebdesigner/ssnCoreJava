package com.ssn.array;

import java.util.Arrays;
import java.util.Collections;


public class ArraySort1 {

	public static void main(String[] args) {
		
		// sorting strings array assending and desending
		
		String[] fruits = {"Orange", "Grape", "Apple", "Lemon", "Banana"};
		
	    System.out.println("Before sorting: " + Arrays.toString(fruits));
	    Arrays.sort(fruits);
	    System.out.println("After sorting: " + Arrays.toString(fruits));
	    
	    
	     System.out.println("Alphabetical order: " + Arrays.toString(fruits));
	     Arrays.sort(fruits, Collections.reverseOrder());
	     System.out.println("Reverse-alphabetical order: " + Arrays.toString(fruits));
	    
	}

}
