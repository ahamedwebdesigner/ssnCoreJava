package com.ssn.OOP2;

public class ObjectExplore {

	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj);
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println("obj.equal.obj  => "  +obj.equals(obj));
		System.out.println("obj.equal.obj2  =>"  +obj.equals(obj2));
		
		
		
	}
	
		
	
}
