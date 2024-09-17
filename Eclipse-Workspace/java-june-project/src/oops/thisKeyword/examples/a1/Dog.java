package oops.thisKeyword.examples.a1;

// Plain Old Java Object Class - POJO Class

public class Dog {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

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
