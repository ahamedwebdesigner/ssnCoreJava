package com.ssn.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayCon2 {

	public static void main(String[] args) {

		
		 String [] sa = {"one", "two", "three", "four"};
		 ReSortComparator rs = new ReSortComparator();
	        Arrays.sort(sa, rs);//re-sort the array using the Comparator. sort(sa, rs)
		 
	        System.out.println(Arrays.toString(sa));
	}
	
    static class ReSortComparator implements Comparator{//define the Comparator, it's ok for this to be an inner class
    	@Override
		public int compare(Object a, Object b) {
			// TODO Auto-generated method stub
				return ((String) b).compareTo((String) a);
		}
    }

}



