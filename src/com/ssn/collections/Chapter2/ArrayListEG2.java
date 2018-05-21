package com.ssn.collections.Chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 *  creating custom oobject array list and sorting
 *  using Comparable and comparater
 *  comparatble is used for sort by name
 *  and comparater to sort by price
 */


class Fruit implements Comparable<Fruit> {
	private String Name;
	private int price;

	public Fruit() {
		super();
	}

	public Fruit(String name, int price) {
		super();
		Name = name;
		this.price = price;
	}
	public int compareTo(Fruit fruit) {
		return this.Name.compareTo(fruit.Name);
	}

	public static class CompareByprice implements Comparator<Fruit> {
		public int compare(Fruit f1, Fruit f2) {
			return f1.price - f2.price;
		}
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return Name+" : "+ price;
	}
}




public class ArrayListEG2 {

	public static void main(String[] args) {
		
		ArrayList<Fruit> FruitBasket = new ArrayList<Fruit>();
		FruitBasket.add(new Fruit("Jakfruit", 700));
		FruitBasket.add(new Fruit("Banana", 30));
		FruitBasket.add(new Fruit("Greaps", 100));
		FruitBasket.add(new Fruit("Blueberry", 100));
		FruitBasket.add(new Fruit("Guava", 100));
		FruitBasket.add(new Fruit("Apple", 200));
		FruitBasket.add(new Fruit("PineApple", 100));
		
		
		System.out.println("==================Natural Order======================="); 
		System.out.println(FruitBasket); 
		
		
		System.out.println("==================Sorting using comparable ======================="); 
		// NOte: in order to excuite sort function custom object must me  Comparable
		Collections.sort(FruitBasket);    //i. sorting
		
		System.out.println(FruitBasket);
	    Collections.reverse(FruitBasket); //ii. reversing the sorted list for desending order
		
	  
	    System.out.println("==================Sorting using comparator =======================");
	    Collections.sort(FruitBasket, new Fruit.CompareByprice()); 
		System.out.println(FruitBasket);
		
	}

}
