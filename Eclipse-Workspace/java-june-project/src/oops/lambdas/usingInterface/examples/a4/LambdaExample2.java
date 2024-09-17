package oops.lambdas.usingInterface.examples.a4;

public class LambdaExample2 {

	public static void main(String[] args) {

		MathOperation maths = (x, y) -> {
			return x + y;
		};
		System.out.println(maths.operation(4, 2));

		MathOperation algebra = (a, b) -> a * b;
		System.out.println(algebra.operation(6, 4));
	}

}
