package com.ssn.collections.chap2;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable_eg {

	public static void main(String[] args) {
		Hashtable companies = new Hashtable();
		companies.put("Google", "United States");
		companies.put("Nokia", "Finland");

		companies.put("Sony", "Finland");
		
		System.out.println(companies);
		System.out.println(companies.get("Google"));
		
		System.out.println(companies.isEmpty());  //Is companies hashtable empty
		System.out.println(companies.size());     //size
		System.out.println(companies.keySet());  // get a Set of all the keys
		System.out.println(companies.keys());  // get a Set of all the keys
		
		
		//getting all values as enumeration
				Enumeration enumeration = companies.elements();
				while (enumeration.hasMoreElements()) {
					System.out.println("hashtable values: " + enumeration.nextElement());
				}
				
				companies.clear();
				System.out.println(companies.size());
	}

}
