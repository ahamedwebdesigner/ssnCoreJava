package com.ssn.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExp1 {

	public static void main(String[] args) {
		
		
		// 1 defining arrays
		int array1[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
	    String[] array2 = new String[]{"d","D","A","a","z","j","y","2","6","N"};
	    String[] array3 = {"Mercury","Venus","Earth", "Mars", "Jupiter","Saturn","Uranus","Neptune"};
	    String[] array4 = {"1syed","10syed","6syed","16syed","aaaa","AAAaes"};
	    String[] array5 = {"12","1","22","21","43","34"};
	    
/*	    System.out.println(array1); // identifier is printed
	    System.out.println(Arrays.toString(array1));
	    System.out.println(Arrays.toString(array2));
	    System.out.println(Arrays.toString(array3)); 
	   */
	    //sort
	    //sorting int array
	     System.out.println(Arrays.toString(array1));
	     Arrays.sort(array1); //naturel order sorting ie assending
	     System.out.println(Arrays.toString(array1));
	     
	     // sorting char string
	     System.out.println(Arrays.toString(array2));
	     Arrays.sort(array2); //naturel order sorting ie assending
	     System.out.println(Arrays.toString(array2));
	     
	     // sorting sring array
	     
	     System.out.println(Arrays.toString(array3));
	     Arrays.sort(array3); //naturel order sorting ie assending
	     System.out.println(Arrays.toString(array3));
	     
	     
	     System.out.println(Arrays.toString(array4));
	     Arrays.sort(array4); //naturel order sorting ie assending
	     System.out.println(Arrays.toString(array4));
	     
	     System.out.println(Arrays.toString(array5));
	     Arrays.sort(array5); //naturel order sorting ie assending
	     System.out.println(Arrays.toString(array5));
	     
	     // sort
	    // Arrays.sort(array1, 0,3);
	     
	     
	     
	}

}
