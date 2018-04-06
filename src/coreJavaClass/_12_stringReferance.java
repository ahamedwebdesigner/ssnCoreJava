package coreJavaClass;

public class _12_stringReferance {

	public static void main(String[] args) {
		
		
		//1 
		NewAnimal a1 = new NewAnimal("DOG");
		NewAnimal a2 = new NewAnimal("CAT");
		NewAnimal a3 = new NewAnimal("COW");
		NewAnimal a4 = a1;
	
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		System.out.println("===========================");
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a1==a4);

		
		
		String s1 = "COW";
		String s2 = "COW";
		System.out.println(s1==s2);
		
		String s3 = new String ("DOG");
		String s4 = new String ("DOG");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println("======================");
		System.out.println("hellow"=="hellow");
		
		
		
	}
}


class NewAnimal{
	public String name;

	public NewAnimal(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
	
	
}