package com.ssn.collections.hashmap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;



public class HashMapApp4 {

	public static void main(String[] args) {
		
		NavigableMap<Integer, String> mapHttpStatus = new TreeMap<>();
		
		mapHttpStatus.put(100, "Continue");
		mapHttpStatus.put(200, "OK");
		mapHttpStatus.put(400, "Bad Request");
		mapHttpStatus.put(401, "Unauthorized");
		mapHttpStatus.put(501, "Not Implemented");
		mapHttpStatus.put(500, "Internal Server Error");
	
		
		System.out.println("<------------original----------->");
		mapHttpStatus.forEach(
				
				(k,v)-> System.out.println("Key: " + k + " Value: " + v)
				
				);
		
		
				//System.out.println("<------------forEach----------->");
				//mapHttpStatus.keySet().forEach(System.out::println);        // 1 get Ascending key set
				mapHttpStatus.descendingKeySet().forEach(System.out::println); // 2 get Descending Key Set
				 
				/*System.out.println("<------------descending Map----------->");
				NavigableMap<Integer, String> descendingMap = mapHttpStatus.descendingMap();
				descendingMap.forEach((k,v)->System.out.println("Key: " + k + " Value: " + v));*/
				
				//Using operations on keys
				Integer lowerKey = mapHttpStatus.lowerKey(400);
				System.out.println("Lower key: " + lowerKey);
				 
				Integer floorKey = mapHttpStatus.floorKey(402);
				System.out.println("Floor key: " + floorKey);
				
				
				 
				Integer higherKey = mapHttpStatus.higherKey(500);
				System.out.println("Higher key: " + higherKey);
				 
				Integer ceilingKey = mapHttpStatus.ceilingKey(500);
				System.out.println("Ceiling key: " + ceilingKey);
				 
				
				Map.Entry<Integer, String> firstEntry = mapHttpStatus.firstEntry();
				System.out.println("First entry: " + firstEntry.getKey() + " => " + firstEntry.getValue());
				 
				Map.Entry<Integer, String> lastEntry = mapHttpStatus.lastEntry();
				 
				System.out.println("Last entry: " + lastEntry.getKey() + " => " + lastEntry.getValue());
				 
				Map.Entry<Integer, String> lowerEntry = mapHttpStatus.lowerEntry(401);
				System.out.println("Lower entry: " + lowerEntry.getKey() + " => " + lowerEntry.getValue());
				 
				Map.Entry<Integer, String> floorEntry = mapHttpStatus.floorEntry(401);
				System.out.println("Floor entry: " + floorEntry.getKey() + " => " + floorEntry.getValue());
				 
				Map.Entry<Integer, String> higherEntry = mapHttpStatus.higherEntry(500);
				System.out.println("Higher entry: " + higherEntry.getKey() + " => " + higherEntry.getValue());
				 
				Map.Entry<Integer, String> ceilingEntry = mapHttpStatus.ceilingEntry(500);
				System.out.println("Ceiling entry: " + ceilingEntry.getKey() + " => " + ceilingEntry.getValue());
				 
				
				

	}

}



