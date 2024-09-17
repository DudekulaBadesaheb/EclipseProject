package oops.lambdas.usingInterface.examples.b2;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		Animal dog;
		dog = new Animal() {
			@Override
			public void sound(String suffix) {
				System.out.println("bow bow bow " + suffix);
			}
		};
		dog.sound("***");

		Animal cat;
		cat = (suffix) -> {
			System.out.println("meow meow meow " + suffix);
		};
		cat.sound("^^^");

		Animal cow;
		cow = suffix -> System.out.println("amba amba amba " + suffix);
		cow.sound("$$$");
	}
}
