package com.ssn.array;

import java.util.Arrays;

public class ArraySorting2 {

	public static void main(String[] args) {
		
		int array1[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
	
		
		  System.out.println(Arrays.toString(array1));
			//Arrays.sort(array1, 0,3);
			//Arrays.sort(array1, 0,array1.length /2); // sort half of the array
		    Arrays.sort(array1,array1.length /2,array1.length); // sort half of the array
		   
		     System.out.println(Arrays.toString(array1));

	}

}
