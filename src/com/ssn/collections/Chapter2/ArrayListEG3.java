package com.ssn.collections.Chapter2;

import java.util.ArrayList;
import java.util.Iterator;


/* looping ArrayList
 * 
 */
public class ArrayListEG3 {

	public static void main(String[] args) {
		//1) A1) create ArrayList  Of string simple way
		ArrayList<String> vegBasket = new ArrayList();
		vegBasket.add("Bitter Gourd");
		vegBasket.add("Bottle Gourd");
		vegBasket.add("Cabbage ");
		vegBasket.add("Capsicum ");
		vegBasket.add("Carrot ");
		
		//1) using forloop 
		////////////////////// Advance forLoop
		System.out.println("==============1)Using forLoop ================");
		for (int i = 0; i < vegBasket.size(); i++) {
			System.out.println(vegBasket.get(i));
		}
		
		
		//2) iterate via "while loop"
		System.out.println("==============2)Using while loop================");
		int i = 0;
		while (i < vegBasket.size()) {
			System.out.println(vegBasket.get(i));
			i++;
		}
 
		//3) Advance forloop
		/////////////////////looping Array
		System.out.println("==============3)uisng Advance forloop ================");
		for (String fruit : vegBasket) {
			System.out.println(fruit);
		}
		
		//4) using iterator along with wile loop
		System.out.println("==============4) using iterator ================");
		

		int j=1;
		Iterator<String> vegBaskettIterator = vegBasket.iterator();
		while (vegBaskettIterator.hasNext()) {
			System.out.println(j+". "+vegBaskettIterator.next());
			j++;
		}
		
		System.out.println("==============4) Collections’s stream() util (Java8) ================");
		//5) using java 1.8 forEach method 
		vegBasket.forEach((temp) -> {
			System.out.println("->"+temp);
		});
		
		
	}

}
