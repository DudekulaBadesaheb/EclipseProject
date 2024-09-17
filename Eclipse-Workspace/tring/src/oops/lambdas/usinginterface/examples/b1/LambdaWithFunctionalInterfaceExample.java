package oops.lambdas.usinginterface.examples.b1;

public class LambdaWithFunctionalInterfaceExample {
	public static void main(String[] args) {
		Animal dog;
		dog = new Animal() {

			public void sound() {
				System.out.println("bow bow bow ");

			}
		};
		dog.sound();
		Animal cat;
		cat = () -> {
			System.out.println("meow meow meow");

		};
		cat.sound();
		Animal cow;
		cow = () -> System.out.println("amba amba amba");

		cow.sound();

	}

}