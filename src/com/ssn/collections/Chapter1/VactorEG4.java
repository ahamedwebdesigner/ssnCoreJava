package com.ssn.collections.Chapter1;

import java.util.Vector;


/*
 * Understanding size and increment value
 * */
public class VactorEG4 {
	Vector vec1 = new Vector();
	Vector vec2 = new Vector(3);//	It will create a Vector of initial capacity of 3.
	
	//The initial capacity is 4 and capacityIncrement is 6. 
	//It means upon insertion of 5th element the size would be 10 (4+6) and on 11th insertion it would be 16(10+6).
	Vector vec3= new Vector(4, 6);
	                             
	public static void main(String[] args) {
	
		/* Adding elements to a vector*/
		/* Vector of initial capacity(size) of 2 
		 * After exceeding two element the capacity become initial site + 10*/
	      Vector<String> vec = new Vector<String>(2,10);
	      vec.addElement("Apple");
	      vec.addElement("Banana");
	      vec.addElement("Graps");
	    //  vec.addElement("Oranges");
	      
	      System.out.println("Size is: "+vec.size()); // size is 
	      System.out.println("Default capacity increment is: "+vec.capacity());
	      

	   

	      /*size and capacityIncrement after two insertions*/
	      System.out.println("Size after addition: "+vec.size());
	      System.out.println("Capacity after increment is: "+vec.capacity());
	      
	      
	      
	}
	


}
