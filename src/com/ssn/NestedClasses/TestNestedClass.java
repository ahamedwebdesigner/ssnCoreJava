package com.ssn.NestedClasses;

import com.ssn.NestedClasses.OuterClass.StaticNestedInner;

public class TestNestedClass {

	public static void main(String[] args) {
		  
		
		
		StaticNestedInner nestedObject = new OuterClass.StaticNestedInner();
		  nestedObject.display();
	}

}
