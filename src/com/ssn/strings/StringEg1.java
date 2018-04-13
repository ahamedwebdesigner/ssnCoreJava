package com.ssn.strings;

public class StringEg1 {

	public static void main(String[] args) {
		
		//1) length of the string 
/*		String s1="hello"; 
		String s2="whatsup"; 
		System.out.println("string length is: "+s1.length());  
		System.out.println("string length is: "+s2.length());*/
		
		//2) comparing two string
	 	//if s1 > s2, it returns a positive number  
		//if s1 < s2, it returns a negative number 
		//if s1 == s2, it returns 0
		
		/*String str1="hello";
		String str2="hello"; 
		String str3="hemlo"; 
		String str4="flag";
		String str5="aak";
		
		String str6="bbbbbbbbb";
		String str7="bbbb";
		
		System.out.println(str1.compareTo(str2)); // 0 because both are equal
		System.out.println(str1.compareTo(str3));  //-1 because "l" is only one time lower than "m" 
		System.out.println(str1.compareTo(str4));  // 2 because "h" is 2 times greater than "f"
		System.out.println(str1.compareTo(str5));  // 7 because "h" is 7 times greater than "a"
		System.out.println(str6.compareTo(str7));
		*/
		
		
		//3 concat
/*		String s1="hello ";
		s1.concat("how are you");  //hello note: strings are immutable
		s1=s1.concat("how are you"); //hello how are you
		System.out.println(s1);*/
		
		//4 IsEmpty
/*		String s1=""; 
		
		String s2="hello"; 
		String s3=" "; 
		System.out.println(s1.isEmpty());      // true
		System.out.println(s2.isEmpty());      // false
		System.out.println(s3.trim().isEmpty());// true -  note trim remouves empty spaces
		*/
		
		//5 Trim
/*		String s1="  hello   ";  
		System.out.println(s1+"how are you");        // without trim()  
		System.out.println(s1.trim()+"how are you"); // with trim()  

		*/
		
		
		//6 toLowerCase / toUpper
/*		String s1="HELLO HOW Are You?";
		String s1lower=s1.toLowerCase();
		System.out.println(s1lower);*/
				
	/*	
		String s1="hello how are you";  
		String s1upper=s1.toUpperCase();  
		System.out.println(s1upper);  */
		
		
		//7 ValueOf() different types of values into string
		//		public static String valueOf(boolean b)
		//		public static String valueOf(char c)
		//		public static String valueOf(char[] c)
		//		public static String valueOf(int i)
		//		public static String valueOf(long l)
		//		public static String valueOf(float f)
		//		public static String valueOf(double d)
		//		public static String valueOf(Object o)
		
/*		System.out.println(     String.valueOf(10)   );
		System.out.println(     String.valueOf(010)   );
		System.out.println(     String.valueOf(0757)   );
		System.out.println(     String.valueOf(0x10)   );
		System.out.println(     String.valueOf(10.00)   );*/
		
		//8 replace()
		
/*		String s1="zzzzzzz"; 
		String s2="zzz zzzz"; 
		String replaceString=s1.replace('z','t'); 
		String replaceString2=s2.replace(' ','-'); 
		System.out.println(replaceString);
		System.out.println(replaceString2);*/
		
		String s2="Hey, welcome to Ahamed"; 
		String replaceString=s2.replace("Ahamed","Syed"); 
		System.out.println(replaceString); 
		
	}

}
