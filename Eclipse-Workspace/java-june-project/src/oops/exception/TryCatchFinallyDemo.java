package oops.exception;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		int total = 0;

		try {
			// division
			total = a / b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println(total);
		}

		// addition
		total = a + b;
		System.out.println(total);

	}

}
