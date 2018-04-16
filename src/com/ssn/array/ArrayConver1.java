package com.ssn.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConver1 {

	public static void main(String[] args) {
		// array to list

		
		
			    
		//String[] stringArray = { "a", "b", "c", "d", "e" };
		
		String[] stringArray = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);  // =>  [a, b, c, d, e]

	}

}
