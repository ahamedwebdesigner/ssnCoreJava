package com.ssn;

public class Temp {

	public static void main(String[] args) {
	 char[] str = "st334ri34ng@@@".toCharArray();
	
	 int sum=0;
	 for(int i = 0;i<str.length;i++) {
		
		if(Character.isDigit(str[i])) {
			//Note: Assigning char to int gives weared results 
			
			//sum+=str[i];
			sum+= Character.getNumericValue(str[i]); 
			
			System.out.println(str[i]);
		}
		
	 }
	 System.out.println("Output -> "+sum);

	}

}
