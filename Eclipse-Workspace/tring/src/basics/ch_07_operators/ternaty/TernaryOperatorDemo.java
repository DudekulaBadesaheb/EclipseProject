package basics.ch_07_operators.ternaty;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// ? ternary operator
		System.out.println(true ? "java" : "python");
		System.out.println(false ? "java" : "python");
		System.out.println(true ? 5 : 10);
		System.out.println(false ? 5 : 10);
		String subject;
		subject = true ? "sql" : "machine learning";
		System.out.println(subject);
		
		subject =false ? "sql" : "machine learning";
		System.out.println(subject);
		char character;
		character =true ? 'a':'z';
		System.out.println(character);
		character =false ? 'a':'z';
		System.out.println(character);
		
		byte byteNumber;
		byteNumber=true ? 1:0;
		System.out.println(byteNumber);
		byteNumber=false ? 1:0;
		System.out.println(byteNumber);
boolean isTrueOrFalse;
isTrueOrFalse=true ? false:true;
System.out.println(isTrueOrFalse);
isTrueOrFalse=false ? false:true;
System.out.println(isTrueOrFalse);
	}

}
