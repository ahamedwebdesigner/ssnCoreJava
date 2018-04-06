package com.ssn.corejava;

import java.util.StringTokenizer;

public class stringsEG1 {

	public static void main(String[] args) {
		//StringTokenizer
		
		String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
		 StringTokenizer st = new StringTokenizer(str);
		
		//System.out.println(st.countTokens()); // number of values
		
		while (st.hasMoreTokens()) {
	      //System.out.println(st.countTokens());
	      System.out.println(st.nextToken());
	    
	      
	    }
	}
	

}
