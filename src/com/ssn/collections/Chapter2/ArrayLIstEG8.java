package com.ssn.collections.Chapter2;

import java.util.ArrayList;

/*
 *  elementary modifications on ArrayList.
 */
public class ArrayLIstEG8 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		// 1) insert
        list.add("ONE");     //Adds "ONE" at the end of the list
        list.add("TWO");     //Adds "TWO" at the end of the list
        list.add("THREE");   //Adds "THREE" at the end of the list
        list.add("FOUR");    //Adds "FOUR" at the end of the list
 
        System.out.println(list);    //Output : [ONE, TWO, THREE, FOUR]
        
        // 2) inserted at specitic position
        list.add(3, "INSERTED");   //Inserts "INSERTED" at position 3
 
        System.out.println(list);   //Output : [ONE, TWO, THREE, INSERTED, FOUR]
 
        list.add(1, "INSERTED");   //Inserts "INSERTED" at position 1 (second place)
 
        System.out.println(list);     //Output : [ONE, INSERTED, TWO, THREE, INSERTED, FOUR]
 
        //3) Remove element
        list.remove("INSERTED");    //Removes first occurence of "INSERTED"
 
        System.out.println(list);     //Output : [ONE, TWO, THREE, INSERTED, FOUR]
 
        list.remove(3);           //Removes an element at position 3
 
        System.out.println(list);     //Output : [ONE, TWO, THREE, FOUR]
 
        // 4) replace
        list.set(3, "REPLACED");    //Replaces an element at position 3 with "REPLACED"
 
        System.out.println(list);     //Output : [ONE, TWO, THREE, REPLACED]

	}

}
