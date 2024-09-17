package oops.lambdas.usingInterface.examples.a2;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		// normal code
		Animal cat = new Animal() {

			@Override
			public void sound(String suffix) {
				System.out.println("meow " + suffix);
			}

		};
		cat.sound("!");

		// using lambda expression 
		Animal dog = (s) -> {
			System.out.println("bow " + s);
		};
		dog.sound("#");

		// using lambda expression
		Animal goat = s -> System.out.println("mmeyy " + s);
		goat.sound("$");

	}

}
