package com.ssn.strings;

public class Stringcons {

	public static void main(String[] args) {
		String s1 = "hellow";
		String s2 = "hellow";
		String s3 = new String("hellow");
		StringBuffer s4 = new StringBuffer("hellow");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.toString().hashCode());
		
		System.out.println("==========================");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4.toString()));
		
		//compares the two referances
/*		if(s1==s2) {
			System.out.println("same type of string");
		}else {
			System.out.println("Not same");
		}*/

		// to compare two strings
/*		if(s1.equals(s2)) {
			System.out.println("same type of string");
		}else {
			System.out.println("Not same");
		}
*/
		

	}

}
