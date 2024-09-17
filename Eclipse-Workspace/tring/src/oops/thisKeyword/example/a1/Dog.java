package oops.thisKeyword.example.a1;

public class Dog {
	private String name;
	private int age;

	public Dog(String name,int age) {
		this.name = name;
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
