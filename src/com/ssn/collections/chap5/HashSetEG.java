package com.ssn.collections.chap5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetEG {

	public static void main(String[] args) {
		// HashSet vegset = new HashSet();           // no order
		//TreeSet vegset = new TreeSet();            // naturel order
		LinkedHashSet vegset = new LinkedHashSet();  // insertion order
		   vegset.add("Snakegourd");
		   vegset.add("Cauliflower");
		   vegset.add("Cabbage");
		   vegset.add("Sweet potato");
		   vegset.add("Onion");
		   vegset.add("Green Chilli");
		   vegset.add("Cucumber");
		   vegset.add("Cucumber");
		   vegset.add("Pumpkin");
		   vegset.add("Bittergourd");
		   vegset.add("Potato");
		 //  vegset.add(null);
		   System.out.println(vegset);
		   
		   int i=1;
		   Iterator vegsetIter = vegset.iterator();
			while (vegsetIter.hasNext()) {
				System.out.println(i+")"+vegsetIter.next());
				i++;
			}

	}

}
