package com.ssn.collections.Chapter3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

	public static void main(String[] args) {
		
		// LinkedList is an implementation of the List and Deque interfaces
		
		//#1 linked list 
		List linkedList1 = new LinkedList();
		linkedList1.add("syed");
		linkedList1.add("Ahamed");
		linkedList1.add("Mustaq");
		linkedList1.add(2011);
				
		//System.out.println("LinkedList content: " + linkedList1);
		//System.out.println("LinkedList size: " + linkedList1.size());
		
		
		//#2 LinkedList using generics to restriet the type fo elements
		
		List<String> linkedList2 = new LinkedList<>();
		linkedList2.add("syed");
		linkedList2.add("Roshan");
		linkedList2.add("ahamed");
	        // We cannot add other than Strings
	        // names.add(2011);
				
		System.out.println("LinkedList content: " + linkedList2);
		System.out.println("LinkedList size: " + linkedList2.size());
		
		//3# convertions - Java Array to LinkedList
		
		Integer[] numbers = {1,2,3,4,5};
		List<Integer> numbersList = new LinkedList<>();
		for(Integer s : numbers){
			numbersList.add(s);
		}
		System.out.println(numbersList);
		
		//LinkedList to Array
		List<Integer> numbersList2 = new LinkedList<>();
		numbersList2.add(1);
		numbersList2.add(2);
		numbersList2.add(3);
		numbersList2.add(4);
		numbersList2.add(5);
		Integer[] ListToNumbers = new Integer[numbersList.size()];
		
		numbers = numbersList.toArray(ListToNumbers);
		System.out.println(Arrays.toString(ListToNumbers));
	}
}
