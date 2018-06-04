package com.ssn.IQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaOutOfMemoryErrorExample {

	
		public static void main(String[] args) {
			
			List<Integer> list = new ArrayList<>();
			Random random = new Random();
			// NOTE: the following while look it infinit one 
			while (true) {
				System.out.println(random);
				list.add(random.nextInt());
			}
				

		}


}
