package oops.reflection.demo;

public class Cat {
	
	private final String name;
	private int age;
	
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
		System.out.println("cat is doing meow " + times + " times");
	}
	
	private void heyThisIsPrivateMethod() {
		System.out.println("How did you call this??");
	}
	
	public static void thisIsPublicStaticMethod() {
		System.out.println("I'm public and static");
	}
	
	private static void thisIsPrivateStaticMethod() {
		System.out.println("I'm private and static");
	}
	
	
	
	
	
	
	
	

}
