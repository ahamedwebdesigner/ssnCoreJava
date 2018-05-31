package com.ssn.IQ.array;

import java.util.HashSet;

public class ArrayFindDuplicateElements2 {

	public static void main(String[] args) {
		// using hash set
		 String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		  
	        HashSet<String> set = new HashSet<String>();
	  
	        for (String arrayElement : strArray){
	        	// HashSet returns true of fals on successfully dition of elements to  set
	            if(!set.add(arrayElement))
	                System.out.println("Duplicate Element is : "+arrayElement);
	            }
	        }

	}


