package com.ssn.collections.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;



public class HashMapApp3 {

	public static void main(String[] args) {
		//////////// 1 Hashmap
		HashMap<Integer, String> unsorted = new HashMap<Integer, String>();

		unsorted.put(10, "Ashraf");
		unsorted.put(5, "Sara");
		unsorted.put(6, "Mohamed");
		unsorted.put(20, "Esraa");
		unsorted.put(1, "Bahaa");
		unsorted.put(7, "Dalia");
		unsorted.put(8, "Amira");
		unsorted.put(99, "Ahmed");
		unsorted.put(50, "Sama");
		unsorted.put(2, "Nada");
		unsorted.put(9, "Osama");

  		
		//2. looping hash map
		Iterator iterator = unsorted.keySet().iterator();
		
		System.out.println("============ HashMap ==================");
		for (Map.Entry entry : unsorted.entrySet()) {
			System.out.println("Key :    " + entry.getKey() + "       Value : "
					+ entry.getValue());
		}
		
		
		
		
		//2)TreeMap are sorted by key
		Map<Integer, String> ascSortedMap = new TreeMap<Integer, String>();
		
		ascSortedMap.put(10, "Ashraf");
		ascSortedMap.put(5, "Sara");
		ascSortedMap.put(6, "Mohamed");
		ascSortedMap.put(20, "Esraa");
		ascSortedMap.put(1, "Bahaa");
		ascSortedMap.put(7, "Dalia");
		ascSortedMap.put(8, "Amira");
		ascSortedMap.put(99, "Ahmed");
		ascSortedMap.put(50, "Sama");
		ascSortedMap.put(2, "Nada");
		ascSortedMap.put(9, "Osama");


		System.out.println("============ TreeMap ==================");
		for (Map.Entry entry : ascSortedMap.entrySet()) {
			System.out.println("Key :    " + entry.getKey() + "   Value : "
					+ entry.getValue());
		}
		
		
		
	/////// 3 sorted treemap
	//3)using comparitor
	Comparator comparator = new Comparator() {
		@Override
		public int compare(Object o1, Object o2) {
			//we are getting keys 
			//return (Integer)o2 - (Integer)o1;
			return (Integer)o1 - (Integer)o2;
		}
	};
					
	
	Map<Integer, String> Desending = new TreeMap<Integer, String>(comparator);
	Desending.putAll(unsorted);
	
	
	System.out.println("============ desending ==================");
	for (Map.Entry entry : Desending.entrySet()) {
		System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
	}
	
	
	}

}



