package com.ssn;

public class Temp2 {

	public static void main(String[] args) {
		String alphabets = "abcdefghijklmnopqrstuvwxyzABC";
		char[] arr = alphabets.toCharArray();
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" : "+Character.getNumericValue(arr[i]));
		}
		
		

	}

}
