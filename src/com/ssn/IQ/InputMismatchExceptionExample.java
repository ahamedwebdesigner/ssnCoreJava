package com.ssn.IQ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputMismatchExceptionExample {

	//The name of the input file.
		private final static String filename = "input.txt";
		
		public static void main(String[] args) {
			  Scanner in = new Scanner (System.in) ;
		        System.out.println("Age?");
		        while (!in.hasNextInt()) {
		            in.next(); // What happens if you use nextLine() instead?
		        }
		        int age = in.nextInt();
		        in.nextLine(); // What happens if you remove this statement?

		        System.out.println("Name?");
		        String name = in.nextLine();

		        System.out.format("[%s] is %d years old", name, age);
		        in.close();
		}

}
