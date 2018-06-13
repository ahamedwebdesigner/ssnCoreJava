package com.ssn.REGx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regxApp3 {

	public static void main(String[] args) {
		
		   String sample ="what Is The latest news today in Europe? is there any thing special or everything is common.";
	           System.out.print(sample);
	           System.out.println("\n------------------------------------------------------");
	           System.out.print(sample.replaceAll("( is | the |in | any )"," "));
	         
	           //System.out.print(sample.replace("( is | the |in | any )"," "));
	           

	}

}
