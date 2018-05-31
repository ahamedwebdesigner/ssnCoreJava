package com.ssn.IQ;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingConcept {

	public static void main(String[] args) {
		
		//1) autoboxing integer
		// with value 10.
        Integer i = new Integer(10);
 
        // unboxing the Object
        int i1 = i;
 
        System.out.println("Value of i: " + i);
        System.out.println("Value of i1: " + i1);
 
        //2) autoboxing of character
        //Autoboxing of char
        Character gfg = 'a';
 
        // Auto-unboxing of Character
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);
        
        
        /* Here we are creating a list of elements of Integer type. adding the int primitives type values */
	      List<Integer> list = new ArrayList<Integer>();
	      for (int j = 0; j < 10; j++) {
	    	  list.add(i);
	      }
	      System.out.println(list);
         

	      
	      
	}

}
