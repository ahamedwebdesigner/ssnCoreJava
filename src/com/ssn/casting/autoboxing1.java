package com.ssn.casting;

public class autoboxing1 {

	public static void main(String[] args) {
		int in =  (int) 4.5;
		System.out.println(in);
		
		
		
		byte b1 = 123;
		int in2 = b1;
		System.out.println(in2);
		
		
		//byte b3 = (byte) (Byte.MAX_VALUE +45);
		byte b3 = 127;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(++b3);
		

	}

}
