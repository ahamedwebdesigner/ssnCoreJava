package com.ssn.temporals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Temporal5 {

	public static void main(String[] args) {
		
		// 1
		long timeNow = System.currentTimeMillis();
		System.out.println(timeNow);
		
		//2 bench marking functionality
		
		long startTime = System.currentTimeMillis();
		
		try {
		    Thread.sleep(2000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		
	}

}
