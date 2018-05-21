package com.ssn.collections.chap4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListeg1 {

	public static void main(String[] args) {
		 List a1 = new LinkedList();
	      a1.add("Zara");
	      a1.add("Mahnaz");
	      a1.add("Ayan");
	      a1.add("Ayan");
	      a1.add(null);
	    //  System.out.println(" ArrayList Elements");
	     // System.out.print("\t" + a1);
	      
		   int i=1;
		   Iterator a1I = a1.iterator();
			while (a1I.hasNext()) {
				System.out.println(i+")"+a1I.next());
				i++;
			}
			

	}

}
