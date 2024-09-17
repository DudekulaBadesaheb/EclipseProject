package oops.lambdas.usingInterface.examples.a1;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		// normal way
		Animal cat = new Animal() {

			@Override
			public void eat() {
				System.out.println("num num num");
			}

		};
		cat.eat();

		Animal dog = () -> {
			System.out.println("munch munch munch");
		};
		dog.eat();
		
		Animal cow = () -> System.out.println("slurp slurp slurp");
		cow.eat();

	}

}
