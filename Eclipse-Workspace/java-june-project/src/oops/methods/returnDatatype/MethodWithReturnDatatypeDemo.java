package oops.methods.returnDatatype;

public class MethodWithReturnDatatypeDemo {

	public static void main(String[] args) {
		voidMethod();

		String subject = printSubjectName();
		System.out.println(subject); //

		String stringVariable = getStringValue();
		System.out.println(stringVariable);

		char charVariable = getCharValue();
		System.out.println(charVariable);

		byte byteVariable = getByteValue();
		System.out.println(byteVariable);

		short shortVariable = getShortValue();
		System.out.println(shortVariable);

		int intVariable = getIntValue();
		System.out.println(intVariable);

		long longVariable = getLongValue();
		System.out.println(longVariable);

		float floatVariable = getFloatValue();
		System.out.println(floatVariable);

		double doubleVariable = getDoubleValue();
		System.out.println(doubleVariable);

		boolean booleanVariable = getBooleanValue();
		System.out.println(booleanVariable);
	}

	public static void voidMethod() {
		System.out.println("This method does not return any value");
	}

	public static String printSubjectName() {
		String subject = "python";
		return subject;
	}

	public static String getStringValue() {
		String stringVariable = "java";
		return stringVariable;
	}

	// char
	public static char getCharValue() {
		char charVariable = 'Z';
		return charVariable;
	}

	// byte
	public static byte getByteValue() {
		byte byteVariable = 127;
		return byteVariable;
	}

	// short
	public static short getShortValue() {
		short shortVariable = 32767;
		return shortVariable;
	}

	// int
	public static int getIntValue() {
		int intVariable = 100;
		return intVariable;
	}

	// long
	public static long getLongValue() {
		long longVariable = 1_234_567_890L;
		return longVariable;
	}

	// float
	public static float getFloatValue() {
		float floatVariable = 1.10F;
		return floatVariable;
	}

	// double
	public static double getDoubleValue() {
		double doubleVariable = 1.12345;
		return doubleVariable;
	}

	// boolean
	public static boolean getBooleanValue() {
		boolean booleanVariable = true;
		return booleanVariable;
	}

}
