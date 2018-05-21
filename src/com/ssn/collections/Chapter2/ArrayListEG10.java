package com.ssn.collections.Chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEG10 {

	public static void main(String[] args) {
		//Shuffle, Reverse, Copy, Rotate and Swap List using Collection APIs
		
		List<String> SocialMediaList = new ArrayList<String>();
		 
		SocialMediaList.add("Google");
		SocialMediaList.add("Facebook");
		SocialMediaList.add("Twitter");
		SocialMediaList.add("Snap Inc");
		SocialMediaList.add("Crunchify LLC");
		SocialMediaList.add("TechCrunch");
		SocialMediaList.add("Verizon");
 
		// creating n
		List<String> newList = new ArrayList<String>(SocialMediaList);
 
		// Print list before any operation.
		System.out.println("Printing result before any Operation: \t" + SocialMediaList);
 
		// Randomly permutes the specified list using a default source of randomness.
		Collections.shuffle(SocialMediaList);
		System.out.println("Printing result after shuffle(): \t" + SocialMediaList);
 
		// Reverses the order of the elements in the specified list.
		Collections.reverse(SocialMediaList);
		System.out.println("Printing result after reverse(): \t" + SocialMediaList);
 
		// Copies all of the elements from one list into another.
		Collections.copy(newList, SocialMediaList);
		System.out.println("Printing result after copy(): \t\t" + newList);
 
		// Rotates the elements in the specified list by the specified distance.
		// Get last two elements in to the first position
		Collections.rotate(newList, 2);
		System.out.println("Printing result after rotate(): \t" + newList);
 
		// Returns the number of elements in this list.
		System.out.println("Printing total count using size(): \t" + newList.size());
 
		// Swaps the elements at the specified positions in the specified list.
		Collections.swap(newList, 2, 4);
		System.out.println("Printing result after swap(): \t\t" + newList);

	}

}
