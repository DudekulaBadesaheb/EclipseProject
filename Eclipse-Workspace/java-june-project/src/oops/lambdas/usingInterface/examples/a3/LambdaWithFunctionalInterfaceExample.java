package oops.lambdas.usingInterface.examples.a3;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		// normal code
		Animal cat = new Animal() {

			@Override
			public void sound(String prefix, String suffix) {
				System.out.println(prefix + " meow " + suffix);
			}

		};
		cat.sound("!", "!");

		// using lambda expression
		Animal dog = (p, s) -> {
			System.out.println(p + " bow " + s);
		};
		dog.sound("#", "#");

		// using lambda expression
		Animal goat = (p, s) -> System.out.println(p + " mmeyy " + s);
		goat.sound("$", "$");

	}

}
