package oops.methods.returnDatatype;

public class MethodeWithReturnDtatypeDemo {

	public static void main(String[] args) {
		String subject = printSubjectName();
		System.out.println(subject);
		String stringVariable = getStringValue();
		System.out.println(stringVariable);
		int intVariable = getIntValue();
		System.out.println(intVariable);
		char charcharecter = getcharecter();
		System.out.println(charcharecter);
		byte values = getValues();
		System.out.println(values);
		long longNumber = getLongNumber();
		System.out.println(longNumber);
		double doubleNumber = getdoublenumber();
		System.out.println(doubleNumber);
		float floatNumber = getfloatnumber();
		System.out.println(floatNumber);
		short s = getshort();
		System.out.println(s);

	}

	public static String getStringValue() {
		String stringVariable = "java";
		return stringVariable;
	}

	public static String printSubjectName() {
		String subject = "python";
		// System.out.println(subject);
		return subject;
	}

	public static int getIntValue() {
		int intVariable = 100;
		return intVariable;
	}

	public static char getcharecter() {
		char charcharecter = 'D';
		return charcharecter;
	}

	public static byte getValues() {
		byte values = 127;
		return values;
	}

	public static long getLongNumber() {
		long longNumber = 123456789;
		return longNumber;

	}

	public static double getdoublenumber() {
		double doubleNumber = 233333;
		return doubleNumber;
	}

	public static float getfloatnumber() {
		float floatNumber = 2355;
		return floatNumber;
	}

	public static short getshort() {
		short s = 2345;
		return s;
	}

}
