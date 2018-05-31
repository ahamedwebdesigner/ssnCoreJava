package com.ssn.IQ.strings;

public class ReplaceWhiteSpaces {

	public static void main(String[] args) {
		 
		// 1. using replaceALL spaces
		 String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
		 String strWithoutSpace = str.replaceAll("\\s", "");
		 System.out.println(strWithoutSpace);
		 
		 
		 //2. using char arry
		 
		 char[] strArray = str.toCharArray();
		 StringBuffer sb = new StringBuffer();
		 for (int i = 0; i < strArray.length; i++) {
	            if( (strArray[i] != ' ') && (strArray[i] != '\t') ){
	                sb.append(strArray[i]);
	            }
	     }
	     System.out.println(sb.toString());
	        
	}

}
