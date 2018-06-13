package com.ssn.REGx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regxApp1 {

	public static void main(String[] args) {
		// 1 pattern matching examples
		
				//1st way  
				Pattern p = Pattern.compile(".ello.");//. represents single character  
				Matcher m = p.matcher("hellow");  
				boolean b = m.matches();  
				System.out.println(b);
				
				//2 method
				
/*	*/			//2nd way  
				boolean b2=Pattern.compile(".s").matcher("as").matches();  
				System.out.println(b2);
				  
				//3rd way  
				boolean b3 = Pattern.matches(".s", "as");  
				System.out.println(b3);

	}

}
