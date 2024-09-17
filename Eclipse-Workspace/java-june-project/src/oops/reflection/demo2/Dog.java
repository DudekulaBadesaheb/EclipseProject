package oops.reflection.demo2;

public class Dog {

	private final String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private void iamPrivateMethod(int number) {
		System.out.println("i am private method " + number);
	}

}
