package oops.thisKeyword.examples.a3;

// Plain Old Java Object Class - POJO Class

public class Dog {
	private String name;
	private int age;

	public Dog() {
		// System.out.println("Hi Mom!"); // not allowed
		this("No Name", 0); // this has to be the very first statement
	}

	public Dog(String name) {
		this.name = name;
		this.age = 1;
	}

	public Dog(String name, int age) {
		this(name);
		this.age = age;
	}

// usage of this keyword is not allowed in static context	
//	public static void printStuff() {
//		System.out.println(this.name);
//	}

	public String getName() {
		// return name;
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void bark() {
		System.out.println("Bark!");
	}
}
