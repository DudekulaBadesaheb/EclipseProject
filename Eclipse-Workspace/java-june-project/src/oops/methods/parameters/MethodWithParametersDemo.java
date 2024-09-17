package oops.methods.parameters;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MethodWithParametersDemo {

	public static void main(String[] args) {

		String subject = getSubject("artificial intelligence");
		System.out.println(subject);

		String stringVariable = getStringValue("legends");
		System.out.println(stringVariable);

		char charVariable = getCharValue('Z');
		System.out.println(charVariable);

		byte byteVariable = getByteValue((byte) 127);
		System.out.println(byteVariable);

		short shortVariable = getShortValue((short) 32767);
		System.out.println(shortVariable);

		int intVariable = getIntValue(100);
		System.out.println(intVariable);

		long longVariable = getLongValue(1234);
		System.out.println(longVariable);

		float floatVariable = getFloatValue((float) 1.1234);
		System.out.println(floatVariable);

		double doubleVariable = getDoubleValue(1.1234567);
		System.out.println(doubleVariable);

		boolean booleanVariable = getBooleanValue(true);
		System.out.println(booleanVariable);
	}

	public static String getSubject(String subject) {
		return subject;
	}

	public static String getStringValue(String stringVariable) {
		return stringVariable;
	}

	public static char getCharValue(char charVariable) {
		return charVariable;
	}

	public static byte getByteValue(byte byteVariable) {
		return byteVariable;
	}

	public static short getShortValue(short shortVariable) {
		return shortVariable;
	}

	public static int getIntValue(int intVariable) {
		return intVariable;
	}

	public static long getLongValue(long longVariable) {
		return longVariable;
	}

	public static float getFloatValue(float floatVariable) {
		return floatVariable;
	}

	public static double getDoubleValue(double doubleVariable) {
		return doubleVariable;
	}

	public static boolean getBooleanValue(boolean booleanVariable) {
		return booleanVariable;
	}

}
