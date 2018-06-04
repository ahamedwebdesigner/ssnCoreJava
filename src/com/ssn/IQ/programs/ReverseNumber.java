package com.ssn.IQ.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, reversedNumber=0, remainder;
		
		
		Scanner scan = new Scanner(System.in);
 
		System.out.print("Enter a Number : ");
		number = scan.nextInt();
 
		while(number != 0)
		{
			remainder = number%10;
			reversedNumber = reversedNumber*10 + remainder;
			number = number/10;
		}
 
		System.out.print("Reverse of the number : " +reversedNumber);
		scan.close();
	}

}
