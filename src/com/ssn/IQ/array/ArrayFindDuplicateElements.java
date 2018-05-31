package com.ssn.IQ.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayFindDuplicateElements {

	public static void main(String[] args) {
		 String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","PHP","JSP"};
		
		//Holds the Auplicate Array
		ArrayList<String> duplicates = new ArrayList<String>();
		
		// number of duplicates
		 HashMap<String, Integer> repetitions = new HashMap<String, Integer>();
		 
		 
		 //1) loop through the array and take one of the value each time as needle as needle
		 
	        for (int i = 0; i < strArray.length-1; i++){
	        	// 2) loop through entrie array elements cmpare each value 
	            for (int j = i+1; j < strArray.length; j++) {
	                if( (strArray[i].equals(strArray[j])) && (i != j) ){
	                	
	                	// check weather element alrady exist of not
	                	if(!repetitions.containsKey(strArray[i])) {
	                		repetitions.put(strArray[i],1);
	                		}else {
	                			repetitions.put(strArray[i], repetitions.get(strArray[i])+1);
	                		}
	                	duplicates.add(strArray[i]);
	                }
	            }
	        }
	        
	        System.out.println(Arrays.toString(duplicates.toArray()));
	        System.out.println(repetitions);

	}

}
