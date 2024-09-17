package oops.lambdas.usingInterface.examples.a4;

public class LambdaWithFunctionalInterfaceExample {

	public static void main(String[] args) {
		// normal code
		MathOperation add1 = new MathOperation() {

			@Override
			public int operation(int a, int b) {
				// int result = a + b;
				// return result;
				return a + b;
			}

		};

		int result;
		result = add1.operation(2, 2);
		System.out.println("addition 1 : " + result);

		// using lambda expression
		MathOperation add2 = (a, b) -> {
			return a + b;
		};
		result = add2.operation(4, 4);
		System.out.println("addition 2 : " + result);

		// using lambda expression
		MathOperation sub1 = (a, b) -> a - b;
		result = sub1.operation(10, 5);
		System.out.println("subtraction : " + result);

	}

}
