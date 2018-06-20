package com.ssn.collections.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;


class ValueComparator implements Comparator<String> {

	HashMap<String, Integer> map = new HashMap<String, Integer>();
	 
	public ValueComparator(HashMap<String, Integer> map){
		this.map.putAll(map);
	}
 
	@Override
	public int compare(String s1, String s2) {
		if(map.get(s1) >= map.get(s2)){
			return -1;
		}else{
			return 1;
		}	
	}

}



public class HashMapApp5 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 10);
		map.put("b", 30);
		map.put("c", 50);
		map.put("d", 40);
		map.put("e", 20);
		System.out.println(map);
 
		
		Comparator<String> comparator = new ValueComparator(map);
		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
		System.out.println(result);
		

				
				

	}
	

	

}



