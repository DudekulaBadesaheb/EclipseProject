package oops.lambdas.usingInterface.examples.b3;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		Animal dog;
		dog = new Animal() {
			@Override
			public void sound(String prefix, String suffix) {
				System.out.println(prefix + " bow bow bow " + suffix);
			}
		};
		dog.sound("~~~~", "***");

		Animal cat;
		cat = (prefix, suffix) -> {
			System.out.println(prefix + " meow meow meow " + suffix);
		};
		cat.sound("###", "^^^");

		Animal cow;
		cow = (prefix, suffix) -> System.out.println(prefix + " amba amba amba " + suffix);
		cow.sound("@@@", "$$$");
	}
}
