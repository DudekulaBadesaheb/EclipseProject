package oops.lambdas.usingInterface.examples.b4;

public class MainClass {

	public static void main(String[] args) {
		int result;

		MathOperation addition;
		addition = new MathOperation() {
			@Override
			public int operation(int a, int b) {
				return a + b;
			}
		};
		result = addition.operation(2, 4);
		System.out.println(result);

		MathOperation multiplication;
		multiplication = (a, b) -> {
			return a * b;
		};
		result = multiplication.operation(2, 4);
		System.out.println(result);

		MathOperation subtraction;
		subtraction = (a, b) -> b - a;
		result = subtraction.operation(2, 4);
		System.out.println(result);

	}

}
