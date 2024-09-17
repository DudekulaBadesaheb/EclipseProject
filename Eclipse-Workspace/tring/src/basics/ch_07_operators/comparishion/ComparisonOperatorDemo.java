package basics.ch_07_operators.comparishion;

public class ComparisonOperatorDemo {
	public static void main(String[] args) {
		// comparison operators
		// "==" check lest value is qual to right value or not
		// "==" equal to or not
		// return true or false
		
		boolean istrueOrFalse;
		istrueOrFalse = 1 == 1;
		System.out.println(istrueOrFalse);

		int a = 1;
		int b = 1;
		istrueOrFalse = a == b;
		System.out.println(istrueOrFalse);
		int c = -1;
		int d = 0;
		int e = 1;
		// "<" less then operator
		// return true or false
		System.out.println(c < d);
	
		// ">" greater then operator
		// return true or false
		System.out.println(e > d);
		// "!" not equal to operator
		// return true or false
		System.out.println(d != e);
		System.out.println(true != true);
		// "<=" less then or equal to operator
		// return true or false
		System.out.println(c <= d);
		// ">=" greater then or equal to operator
		// true or false
		System.out.println(e >= d);
		

	}

}
