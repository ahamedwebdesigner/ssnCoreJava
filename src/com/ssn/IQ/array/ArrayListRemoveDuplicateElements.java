package com.ssn.IQ.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayListRemoveDuplicateElements {

	public static void main(String[] args) {
		 String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","PHP","JSP"};
		 ArrayList<String> listWithDuplicateElements = new ArrayList<String>(Arrays.asList(strArray));
		 
		 // 1) HashSet No insertion order
		 //HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
		 
		 // 2) LinkedHashSet maintain insertion order
		 LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
		  
		  
	        //Constructing listWithoutDuplicateElements using set
	 
	        ArrayList<String> ArrayListWithOutDuplicates = new ArrayList<String>(set);
	        System.out.println(ArrayListWithOutDuplicates);
	        
	}

}
