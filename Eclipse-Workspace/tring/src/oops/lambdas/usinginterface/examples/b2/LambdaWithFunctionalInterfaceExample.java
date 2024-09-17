package oops.lambdas.usinginterface.examples.b2;

public class LambdaWithFunctionalInterfaceExample {
	

	public static void main(String[] args) {
		Animal dog;
		dog = new Animal() {

			public void sound(String suffix) {
				System.out.println("bow bow bow "+suffix);

			}

			
			
		};
		dog.sound("****");
		Animal cat;
		cat = (suffix) -> {
			System.out.println("meow meow meow"+suffix);

		};
		cat.sound("^^^");
		Animal cow;
		cow = (s) -> System.out.println("amba amba amba"+s);

		cow.sound("###");

	}

}