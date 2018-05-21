package com.ssn.enumtest;

enum FruitBasket{
    // This will call enum constructor with one
    // String argument
	 APPLE("RED"), BANANA("YELLOW"), GRAPES("GREEN");
 
    // declaring private variable for getting values
    private String Fruits;
 
    // getter method
    public String getAction() {
        return this.Fruits;
    }
 
    // enum constructor - cannot be public or protected
    private FruitBasket(String furit){
        this.Fruits = furit;
    }
}
 

public class EnumWithCustomValues_5 {

	public static void main(String[] args) {
		FruitBasket[] fruits = FruitBasket.values();
		 
	        for (FruitBasket fruit : fruits) {
	            // use getter method to get the value
	            System.out.println("name : " + fruit.name() + " color: " + fruit.getAction() );
	        }

	}

}
