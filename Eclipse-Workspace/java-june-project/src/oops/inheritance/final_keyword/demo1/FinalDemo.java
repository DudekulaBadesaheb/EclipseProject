package oops.inheritance.final_keyword.demo1;

public class FinalDemo {

	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat();

		final Dog yourDog;
		yourDog = new Dog();
		// final variables can be initialized only once
		// yourDog = new Dog();

		// final double pi = 3.14159;
		// pi = 9;
		// System.out.println(pi);
		System.out.println(PI);

	}

}
