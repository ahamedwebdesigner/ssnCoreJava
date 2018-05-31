package com.ssn.collections.Chapter3;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

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

	@Override
	public String toString() {
		return Name + ":" + price;
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

}

public class LinkdList_sort_eg1 {

	public static void main(String[] args) {
		LinkedList<Fruit> FruitBasket = new LinkedList<Fruit>();
		FruitBasket.add(new Fruit("Jakfruit", 700));
		FruitBasket.add(new Fruit("Banana", 30));
		FruitBasket.add(new Fruit("Greaps", 100));
		FruitBasket.add(new Fruit("Blueberry", 100));
		FruitBasket.add(new Fruit("Guava", 100));
		FruitBasket.add(new Fruit("Apple", 200));
		FruitBasket.add(new Fruit("PineApple", 100));
		
		//1 Before Sorting
		System.out.println(FruitBasket); 
		System.out.println(FruitBasket.get(1)); 
		
		//2 After Sorting
		
		// NOte: in order to excuite sort function custom object must me  Comparable
		Collections.sort(FruitBasket);    //i. sorting
		//Collections.reverse(FruitBasket); //ii. reversing the sorted list for desending order
		
		/*
		Collections.sort(FruitBasket, new Fruit.CompareByprice()); 
		//3 Before Sorting
		
		System.out.println(FruitBasket); 
		
		//loop
		
		for (Fruit fruit : FruitBasket) {
			System.out.println(fruit.getName());
		}
		
		
		Iterator<Fruit> FruitBasketIterator = FruitBasket.iterator();
		while (FruitBasketIterator.hasNext()) {
			System.out.println("==>"+FruitBasketIterator.next().getName());
		}
		
		FruitBasket.forEach((temp) -> {
			System.out.println(" == >"+temp);
		});
		
		*/
	}

}
