package com.ssn.IQ;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEG {

	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(123);

		int theValue = atomicInteger.get();
		System.out.println(theValue);
		
		System.out.println(atomicInteger.getAndAdd(10));  // get the initial value and then add 10
		System.out.println(atomicInteger.addAndGet(10));  // first add 10 and get the added value
		System.out.println(atomicInteger.getAndIncrement());  // get the initial value and incement 1
		System.out.println(atomicInteger.incrementAndGet());  // ffist increment by one and get the value
		
	

	}

}
