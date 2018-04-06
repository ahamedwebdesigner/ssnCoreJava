package com.ssn.corejava;

import java.util.StringTokenizer;

public class stringEg2 {

	public static void main(String[] args) {
		//System.out.printf("%f,%d %s",floatvar,intVar,StringVar);
		//%s -> string
		//%d -> int
		//%f -> float
		//System.out.printf("Hellow i am %s", "SYED");

		
		String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
		StringTokenizer st = new StringTokenizer(str);
		
		
		while (st.hasMoreTokens()) {
		   System.out.printf("%d . Today is %s \n",  st.countTokens(),st.nextToken());
		}
		
	}

}
