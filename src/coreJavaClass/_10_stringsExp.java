package coreJavaClass;

public class _10_stringsExp {

	public static void main(String[] args) {
		
		String s1 = "hellow";
		String s3 ="All";
		String s2 =s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		s1=null;
		s3 = s3+s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		System.out.println("============================");
		Animal a1 = new Animal("dog");
		Animal a2 =a1;
		System.out.println(a1);
		a1=null;
		System.out.println("a1 value "+a1);
		System.out.println("a2 value "+a2);
		
		

	}

}


class Animal{
	public String name;

	public Animal(String name) {
		this.name = name;
	}
}