package oops.thisKeyword.example.a3;

public class Dog {
	private String name;
	private int age;
	
	public Dog() {
		//System.out.println("hi mom!"); // not allowed
		this("no Name,0");// this has to be the 
	}

	public Dog(String name) {
		this.name = name;
		this.age = 1;
		System.out.println("age is: " + this.age);
	}
	public Dog(String name,int age) {
		this(name);
		this.age = age;
	}
	// usage of this keyword is not allowed in static context
	//public static void printStuff() {
		//System.out.println(this.name);
	//}

	public String getName() {
		return this.name;
	}

	

	public int getAge() {
		return this.age;
	}

	public void bark() {
		System.out.println("Bark");
	}
}
