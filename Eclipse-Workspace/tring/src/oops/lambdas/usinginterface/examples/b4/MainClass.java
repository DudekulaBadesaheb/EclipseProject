package oops.lambdas.usinginterface.examples.b4;

public class MainClass {

	public static void main(String[] args) {
		int result;

		MathOperation addition;
		addition = new MathOperation() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}

		};
		result = addition.sum(2, 3);
		System.out.println(result);
		MathOperation mul;
		mul = (a, b) -> {
			return a * b;
		};
		result = mul.sum(2, 4);
		System.out.println(result);
		MathOperation subtraction;

		subtraction = (a, b) -> a - b;

		result = subtraction.sum(2, 4);
		System.out.println(result);
	}

}
