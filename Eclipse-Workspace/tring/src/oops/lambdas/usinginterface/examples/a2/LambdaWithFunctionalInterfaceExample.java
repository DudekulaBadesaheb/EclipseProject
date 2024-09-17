package oops.lambdas.usinginterface.examples.a2;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		Animal Cat = new Animal() {

			@Override
			public void sound(String suffix) {
				System.out.println("meow meow meow "+ suffix);
			}

		};
		Cat.sound("!");
		// Using lambda expression
		Animal Dog = (s) -> {
			System.out.println("bow bow bow "+ s);
		};
		Dog.sound("#");

		Animal cow = s -> System.out.println("amba amba amba "+ s);
		cow.sound("&");

	}

}
