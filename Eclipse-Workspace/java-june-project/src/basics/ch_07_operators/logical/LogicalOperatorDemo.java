package basics.ch_07_operators.logical;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		// Logical Operators
		// && Logical AND Operator
		// || Logical OR Operator
		// ! Logical NOT Operator

		// && Logical AND Operator
		// return true or false
		System.out.println((1 == 1) && (2 == 2)); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false

		// || Logical OR Operator
		// return true or false
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false

		// ! Logical NOT Operator
		// return true or false
		System.out.println(!true); // false
		System.out.println(!false); // true
		System.out.println(!(!true)); // true
	}

}
