package com.ssn.Methods;


 class Balloon {

	private String color;

	public Balloon(){}
	
	public Balloon(String c){
		this.color=c;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Balloon [color=" + color + "]";
	}
	
	
}



public class FunctionArgs {

	public static void main(String[] args) {
		
		
		Balloon red = new Balloon("Red"); //memory reference 50
		Balloon blue = new Balloon("Blue"); //memory reference 100
		
		swap(red, blue);
		System.out.println("red color  =  "+red);
		System.out.println("blue color  =  "+blue);
		
		
		ColorChanger(blue);
		System.out.println("blue color="+blue.getColor());
	}
	
	//Generic swap method
		public static void swap(Object o1, Object o2){
			System.out.println("=================");
			System.out.println("o1 object  =  "+o1);
			System.out.println("o2 object  =  "+o2);
			Object temp = o1;
			o1=o2;
			o2=temp;
			System.out.println("=================");
			System.out.println("o1 object  =  "+o1);
			System.out.println("o2 object  =  "+o2);
			System.out.println("=================\n\n\n");
		}
		
		
		private static void ColorChanger(Balloon balloon) { //baloon=100
			balloon.setColor("Red"); //baloon=100
			balloon = new Balloon("Green"); //baloon=200
			balloon.setColor("Blue"); //baloon = 200
		}
		
		

}
