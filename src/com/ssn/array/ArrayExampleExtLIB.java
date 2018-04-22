package com.ssn.array;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayExampleExtLIB {

	public static void main(String[] args) {
		   int[] intArray = { 1, 2, 3, 4, 5 };
		    int[] intArray2 = { 6, 7, 8, 9, 10 };
		    // Apache Commons Lang library
		    int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);
		    System.out.println(Arrays.toString(combinedIntArray));

	}

}
