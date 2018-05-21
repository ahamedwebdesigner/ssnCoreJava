package com.ssn.collections.chap6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashMapEG {

	public static void main(String[] args) {
//		Hashtable companies = new Hashtable();
		HashMap companies = new HashMap();
		companies.put("Google", "United States");
		companies.put("Nokia", "Finland");

		companies.put("Sony", "Finland");
		System.out.println(companies);
		companies.keySet();
		
		Iterator it = companies.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		
		

	}

}
