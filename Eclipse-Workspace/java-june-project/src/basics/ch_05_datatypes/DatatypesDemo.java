package basics.ch_05_datatypes;

// 8 primitive datatypes
// String datatype
public class DatatypesDemo {

	public static void main(String[] args) {
		// single character
		char charVariable = 'Z';
		System.out.println(charVariable);

		// set of characters
		String stringVariable = "java";
		System.out.println(stringVariable);

		// whole numbers
		byte byteVariable = 127;
		System.out.println(byteVariable);

		short shortVariable = 32767;
		System.out.println(shortVariable);

		int intVariable = 1234567;
		System.out.println(intVariable);

		long longVariable = 1_234_567_890L;
		System.out.println(longVariable);

		// decimal numbers
		float floatVariable = 1.23456F;
		System.out.println(floatVariable);

		double doubleVariable = 1.234567890;
		System.out.println(doubleVariable);

		// yes / no -- in / out -- on / off -- 1 / 0
		boolean booleanVariable = true;
		System.out.println(booleanVariable);
	}

}
