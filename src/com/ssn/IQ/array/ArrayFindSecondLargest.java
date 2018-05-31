package com.ssn.IQ.array;

public class ArrayFindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[] { 47498, 14526, 74562, 42681, 75283, 45796 };
		int firstLargest, secondLargest;

		// Checking first two elements of input array
		if (intArray[0] > intArray[1]) {

			// If first element is greater than second element

			firstLargest = intArray[0];
			secondLargest = intArray[1];
		} else {
			// If second element is greater than first element

			firstLargest = intArray[1];
			secondLargest = intArray[0];
		}

		for (int i = 2; i < intArray.length; i++) {
			if (intArray[i] > firstLargest) {
				// If element at 'i' is greater than 'firstLargest'

				secondLargest = firstLargest;
				firstLargest = intArray[i];
			} else if (intArray[i] < firstLargest && intArray[i] > secondLargest) {
				// If element at 'i' is smaller than 'firstLargest' and greater than
				// 'secondLargest'
				secondLargest = intArray[i];
			}
		}
		System.out.println(secondLargest);

	}

}
