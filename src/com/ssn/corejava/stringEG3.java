package com.ssn.corejava;

public class stringEG3 {

	public static void main(String[] args) {
		String s1 ="hellow";
		String s2 ="hellow";
		
		
		//0 ==
		
		//+2number s1>s2
		
		
		// if s1 and s2 are same 
		System.out.println(            s1.compareTo(s2)          );
		//-1 sl < s2
		System.out.println(           "apple".compareTo("boll")          );
		//+2 number s1>s2
		System.out.println(           "b".compareTo("a")          );
		
		System.out.println("============================================");
		System.out.println(           "aabc".compareTo("acba")          );
		System.out.println(           "aaabc".compareTo("aaacba")          );
		System.out.println(           "aaxc".compareTo("aaya")          );
		System.out.println(           "aayc".compareTo("aaxa")          );
		
		System.out.println("===================  3   ====================");
		
		//System.out.println(           "a".compareTo("A")          );
		//System.out.println(           "A".compareTo("a")          );
		//System.out.println(           "A".compareToIgnoreCase("a")          );
		System.out.println(           "Apple".compareToIgnoreCase("aPPle")          );
	}

}
