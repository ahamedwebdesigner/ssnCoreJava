package com.ssn.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapApp1 {

	public static void main(String[] args) {
		HashMap<Integer, String> ParamenentEmployes = new HashMap<Integer, String>();
	    
			ParamenentEmployes.put(6,"SMITH");
			ParamenentEmployes.put(2,"ALLEN");
			ParamenentEmployes.put(3,"WARD");
			ParamenentEmployes.put(9,"JONES");
			ParamenentEmployes.put(5,"MARTIN");
			ParamenentEmployes.put(1,"MARTIN");
			ParamenentEmployes.put(0,"AHAMED");
		
			ParamenentEmployes.put(7,"CLARK");
			ParamenentEmployes.put(8,"KING");
			ParamenentEmployes.put(4,"SCOTT");
			ParamenentEmployes.put(10,"KING");
			ParamenentEmployes.put(11,"JAMES");
			ParamenentEmployes.put(14,"FORD");
			
			System.out.println(ParamenentEmployes);	
			/*System.out.println((String) ParamenentEmployes.get(0));	
			System.out.println((String) ParamenentEmployes.get(1));*/
			
			
			//2. looping hash map
/*			Iterator iterator = ParamenentEmployes.keySet().iterator();
			
			System.out.println("============ while ==================");
			while(iterator.hasNext()){
			  Object key   = iterator.next();
			  Object value = ParamenentEmployes.get(key);
			  
			  System.out.println(value);
			}
			
			*/
			
			Set<Integer> keyset = ParamenentEmployes.keySet();
			Collection<String> values = ParamenentEmployes.values();
			
			/* System.out.println("============ for-loop ==================");
				//access via new for-loop
				for(Object key : ParamenentEmployes.keySet()) {
				    Object value = ParamenentEmployes.get(key);
				    System.out.println(value);
				}*/
				
			
/*			// looping values
			System.out.println("============ values() ==================");
			for( String anObject : ParamenentEmployes.values()){
				System.out.println(anObject);
			}
				*/
			
/*			System.out.println(ParamenentEmployes);	
			System.out.println(ParamenentEmployes.size());	
			//ParamenentEmployes.remove(1); 
			ParamenentEmployes.remove(ParamenentEmployes.size()+1);//remove element
			
			System.out.println(ParamenentEmployes);	*/
	}

}
