package basics.ch_07_operators.LogicalOperatorDemo;

public class lLogicalOperators {

	public static void main(String[] args) {
		// Logical operators
		// && logical operator
		// || logical operator
		// ! logical operator
		
		// && logical AND operator
		// return true or false 
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		// || logical operator
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		// ! logical operator
		System.out.println(! true);//false
		System.out.println(! false);//true
		System.out.println(!(!true));
		
	}

}
