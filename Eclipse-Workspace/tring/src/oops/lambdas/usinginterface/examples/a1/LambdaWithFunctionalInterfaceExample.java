package oops.lambdas.usinginterface.examples.a1;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		Animal Cat = new Animal() {

			@Override
			public void eat() {
				System.out.println("num num num");
			}

		};
		Cat.eat();
		// Using lambda expression
		Animal Dog = () -> {
			System.out.println("much much much");
		};
		Dog.eat();

		Animal cow = () -> System.out.println("am am am");
		cow.eat();

	}

}
