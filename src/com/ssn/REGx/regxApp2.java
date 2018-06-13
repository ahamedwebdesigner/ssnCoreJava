package com.ssn.REGx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regxApp2 {

	public static void main(String[] args) {
		
		// fixed letters with optional letters
/*		System.out.println(Pattern.compile("[ha]ellow").matcher("hellow").matches());
		System.out.println(Pattern.compile("^[a-y-_]ellow$").matcher("-ellow").matches());
		*/
		// 1. default case sensitive
		System.out.println(Pattern.compile("hellow").matcher("hellow").matches());
		System.out.println(Pattern.compile("hellow").matcher("HelloW").matches());
		
		// 2. case insensitive
		System.out.println(Pattern.compile("(?i)hellow").matcher("HelloW").matches());

	}

}
