package com.ssn.array;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		// 2serch

		int array1[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2, 4, 4 };
		// Returns a negative number if the specified key is not found in the array
		System.out.println("before: " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("after: " + Arrays.toString(array1));
		System.out.println(Arrays.binarySearch(array1, 5));

		
		
		String[] array3 = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

		System.out.println("before: " + Arrays.toString(array3));
		Arrays.sort(array3);
		System.out.println("after: " + Arrays.toString(array3));
		System.out.println(Arrays.binarySearch(array3, "Mercury"));

	}

}
