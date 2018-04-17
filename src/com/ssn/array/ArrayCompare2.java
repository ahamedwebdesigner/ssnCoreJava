package com.ssn.array;

import java.util.Arrays;

public class ArrayCompare2 {

	public static void main(String[] args) {
		
/*		
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };  // different memory locatio gives false
		int arr2[] = arr1;          // same memory location gites true
		
		if (arr1 == arr2)            // Same as arr1.equals(arr2)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		*/
		
	        int arr1[] = {1, 2, 3};
	        int arr2[] = {2, 1, 3};
	        
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        
	         //int arr2[] = arr1;  
	          if (Arrays.equals(arr1, arr2))
	        	//if (arr1.equals(arr2))      // array elements equals is not overriden and ie., its behaviour is equals to == (referance comparison)
	            System.out.println("Same");
	        else
	            System.out.println("Not same");
	        
	     
		
		
/*		 // inarr1 and inarr2 have same values
        int inarr1[] = {1, 2, 3};
        int inarr2[] = {3, 2, 1};   
        Object[] arr1 = {inarr1};  // arr1 contains only one element
        Object[] arr2 = {inarr2};  // arr2 also contains only one element
        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");*/
		
	/*	
		 int inarr1[] = {1, 2, 3};
	        int inarr2[] = {1, 2, 3}; 
	        Object[] arr1 = {inarr1};  // arr1 contains only one element
	        Object[] arr2 = {inarr2};  // arr2 also contains only one element
	        if (Arrays.deepEquals(arr1, arr2))
	            System.out.println("Same");
	        else
	            System.out.println("Not same");*/
	        

		/*     int inarr1[] = {1, 2, 3};
	        int inarr2[] = {1, 2, 3};  
	        Object[] arr1 = {inarr1};  // arr1 contains only one element
	        Object[] arr2 = {inarr2};  // arr2 also contains only one element
	        Object[] outarr1 = {arr1}; // outarr1 contains only one element
	        Object[] outarr2 = {arr2}; // outarr2 also contains only one element        
	        if (Arrays.deepEquals(outarr1, outarr2))
	            System.out.println("Same");
	        else
	            System.out.println("Not same");*/
	        
	        
	}

}
