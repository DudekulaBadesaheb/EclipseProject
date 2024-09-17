package basics.ch_07_operators.comparison;

public class ComparisonOperatorDemo {

	public static void main(String[] args) {
		// Comparison Operators

		// "==" check left value is equal to right value or not
		// "==" equal to or not
		// return true or false

		boolean isTrueOrFalse;

		isTrueOrFalse = 1 == 1;
		System.out.println(isTrueOrFalse); // true

		int a = 1;
		int b = 1;
		isTrueOrFalse = a == b;
		System.out.println(isTrueOrFalse); // true

		int c = -1;
		int d = 0;
		int e = 1;

		// "<" less than operator
		// return true or false
		System.out.println(c < d); // true

		// ">" greater than operator
		// return true or false
		System.out.println(e > d); // true

		// "!=" not equal to operator
		// return true or false
		System.out.println(d != e); // true
		System.out.println(true != true); // false

		// "<=" less than or equal to operator
		// return true or false
		System.out.println(c <= d); // true

		// ">=" greater than or equal to operator
		// true or false
		System.out.println(e >= d); // true

	}

}
