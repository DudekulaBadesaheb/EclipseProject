package oops.lambdas.usinginterface.examples.a3;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		Animal Cat = new Animal() {

			@Override
			public void sound(String suffix ,String preffix) {
				System.out.println(preffix+" meow meow meow "+ suffix);
			}

		};
		Cat.sound("!","!");
		// Using lambda expression
		Animal Dog = (s,p) -> {
			System.out.println(p+" bow bow bow "+ s);
		};
		Dog.sound("#","#");

		Animal cow = (s,p) -> System.out.println(p+" amba amba amba "+ s);
		cow.sound("&","&");

	}

}
