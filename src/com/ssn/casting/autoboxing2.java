package com.ssn.casting;

public class autoboxing2 {

	public static void main(String[] args) {
		float f1 = (float) 99.99;
		int i1 =(int) f1;
		System.out.println(f1);
		System.out.println(i1);
		
		short s1 = 32767;
		byte b1 = (byte) s1;
		int i2 = s1;
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(b1);
	}

}
