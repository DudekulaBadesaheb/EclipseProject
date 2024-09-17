package basics.ch_07_operators.assignment;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		// Assignment Operators

		// "=" Assigns values from right side to left side
		int a = 1;
		System.out.println(a); // 1

		// "++" for increment operator
		// it will increase the value by 1
		// a = a + 1; // shorthand a++;
		a++;
		System.out.println(a); // 2

		// "--" for decrement operator
		// it will decrease the value by 1
		// a = a - 1; shorthand a--;
		a--;
		System.out.println(a); // 1

		// increase the value by 3
		// a = a + 3; // shorthand a += 3
		a += 3;
		System.out.println(a); // 4

		// decrease the value by 3
		// a = a - 3; shorthand a -= 3
		a -= 3;
		System.out.println(a); // 1

		// multiply the value by 2
		// a = a * 2; // shorthand a *= 2
		a *= 2;
		System.out.println(a); // 2

		// divide the value by 2
		// a = a / 2; shorthand a /= 2
		a /= 2;
		System.out.println(a); // 1

		// modulus the value by 2
		int b = 9;
		// b = b % 2; // shorthand b %= 2
		b %= 2;
		System.out.println(b); // 1

	}

}
