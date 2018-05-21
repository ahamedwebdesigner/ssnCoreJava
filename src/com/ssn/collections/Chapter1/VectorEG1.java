package com.ssn.collections.Chapter1;

import java.util.Enumeration;
import java.util.Vector;

/*
 *  vactor is obsolete classes fir java 1.2 
 */
public class VectorEG1 {

	public static void main(String[] args) {
		/* 1. simple vactor */
		/////////////////////////////////////////////////////////
		Vector items = new Vector(); // i) create vactor
									 // 2) add elements
        items.add("Apple");
        items.add("Boll");
        items.add("Cat");
        items.add("Dog");
        items.add("Elephant");
        items.add("Fish");
        
        // 2) using Enumerator for looping vactor
        Enumeration itemsEn = items.elements();

        while (itemsEn.hasMoreElements()) {
            System.out.println(itemsEn.nextElement());
        }
        
    }

}
