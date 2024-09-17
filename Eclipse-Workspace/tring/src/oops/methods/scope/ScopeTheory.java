package oops.methods.scope;

public class ScopeTheory {
	public static int z=300;

	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(z);
		

		// Method Scope
		// Variables declared directly inside a method are
		// available anywhere in the method following
		// the line of code in which they are declared:

		// System.out.println(x);//code here cannot use x
		int x = 100;
		System.out.println(x); // code here can use x
		
		/*
		 * Block Scope{}
		 * a block of code refers to all of the code
		 * between open curly and close curly braces
		 * 
		 * Variables declared inside block of code
		 * are only accessible by the code between
		 * the curly braces,which follows the line
		 * in which the variable was declared
		 */
		//System.out.println(y);,// code here cannot use y
		{
			int y= 200;
			System.out.println(y);//code here can use y
		}
	System.out.println(z);	//System.out.println(y);,// code here cannot use y
	
	}

}
