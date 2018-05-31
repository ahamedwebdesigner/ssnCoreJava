package com.ssn.IQ.array;

import java.util.Arrays;

public class ArraysTwoArraysEqualOrNot {

	public static void main(String[] args) {
		

		 int[] arrayOne = {21, 57, 11, 37, 24};
		 int[] arrayTwo = {21, 57, 11, 37, 24};
		 
		 //1 comparing two array lenth and if equal comparing individual elements
		 boolean equalOrNot = true;
		 if(arrayOne.length == arrayTwo.length) {
	            for (int i = 0; i < arrayOne.length; i++) {
	                if(arrayOne[i] != arrayTwo[i]) {
	                    equalOrNot = false;
	                }
	            }
	        }else{
	            equalOrNot = false;
	        }
		 System.out.println("First Array : "+equalOrNot);
		 //2. converting array to string and comparing resultent string
		 System.out.println(Arrays.toString(arrayOne).equals(Arrays.toString(arrayTwo)));
	}
	
	
	

}
