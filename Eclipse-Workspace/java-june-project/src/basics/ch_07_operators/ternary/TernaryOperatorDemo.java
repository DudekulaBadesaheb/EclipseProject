package basics.ch_07_operators.ternary;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// ? Ternary Operator

		System.out.println(true ? "java" : "python"); // java
		System.out.println(false ? "java" : "python"); // python

		System.out.println(true ? 5 : 10); // 5
		System.out.println(false ? 5 : 10); // 10

		String subject;
		subject = true ? "sql" : "machine learning";
		System.out.println(subject); // sql
		
		subject = false ? "sql" : "machine learning";
		System.out.println(subject); // machine learning
		
		char character;
		character = true ? 'A' : 'Z';
		System.out.println(character); // A
		
		character = false ? 'A' : 'Z';
		System.out.println(character); // Z
		
		byte byteNumber;
		byteNumber = true ? 1 : 0;
		System.out.println(byteNumber); // 1
		
		byteNumber = false ? 1 : 0;
		System.out.println(byteNumber); // 0
		
		boolean isTrueOrFalse;
		isTrueOrFalse = true ? false : true;
		System.out.println(isTrueOrFalse); // false
		
		isTrueOrFalse = false ? true : false;
		System.out.println(isTrueOrFalse);
		
		
		
		
		
		
	}

}
