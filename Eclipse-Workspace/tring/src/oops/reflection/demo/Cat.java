package oops.reflection.demo;

public class Cat {

	private final String name;
	private int age;

// source= GenaretConstracter click* that one
	public Cat(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void meow(int times) {
		System.out.println("Cat is doing meow" + times + "time");
	}

	private void heyThisIsPrivateMethod() {
		System.out.println("how did you call this??");
	}

	private static void thisIsPrivateStaticMethod() {
		System.out.println("I'm private and static");
	}

	public static void thisIsPublicStaticMethod() {
		System.out.println("I'm private and static");
	}
}
