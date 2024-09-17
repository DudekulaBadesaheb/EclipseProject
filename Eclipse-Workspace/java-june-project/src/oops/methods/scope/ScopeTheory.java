package oops.methods.scope;

public class ScopeTheory {
	public static int z = 300;
	// code here can use z
	public static void main(String[] args) {
		System.out.println(z); // code here can use z
		System.out.println(args);

		// Method Scope
		// Variables declared directly inside a method are
		// available anywhere in the method following
		// the line of code in which they are declared:

		// System.out.println(x); // code here cannot use x
		int x = 100;
		System.out.println(x); // code here can use x

		/*
		 * Block Scope {} A block of code refers to all of the code between open and
		 * close curly braces
		 * 
		 * Variables declared inside block of code are only accessible by the code
		 * between the curly braces, which follows the line in which the variable was
		 * declared.
		 */

		// System.out.println(y); // code here cannot use y
		{
			int y = 200;
			System.out.println(y); // code here can use y
		}
		// System.out.println(y); // code here cannot use y

		System.out.println(z); // code here can use z
	}

}
