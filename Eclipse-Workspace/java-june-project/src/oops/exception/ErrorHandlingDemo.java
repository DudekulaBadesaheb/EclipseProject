package oops.exception;

public class ErrorHandlingDemo {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		int total;

		// Code with error handling

		try {
			// division
			total = a / b;
			System.out.println(total);
		} catch (ArithmeticException e) {
			// System.out.println(e);
			// System.err.println(e);
			e.printStackTrace();
		}

		// addition
		total = a + b;
		System.out.println(total);

	}

}
