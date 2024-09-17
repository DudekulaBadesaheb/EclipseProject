package oops.methods.paramitars;

public class mathodWithParamitarsDemo {

	public static void main(String[] args) {
		String subject = getSubject("artificial intelligence");
		System.out.println(subject);

		int number = getNumber(23156);
		System.out.println(number);

		long l = getLong(545465655);
		System.out.println(l);

		float n = getFloat(56565.76f);
		System.out.println(n);

		short s = getShort((short) 32765);
		System.out.println(s);

		byte b = getDyte((byte) 125);
		System.out.println(b);

		double d = getBouble(125);
		System.out.println(d);

		boolean bool = getBoolean(true);
		System.out.println(bool);

		char c = getChar('D');
		System.out.println(c);

	}

	public static String getSubject(String subject) {
		return subject;
	}

	public static int getNumber(int number) {
		return number;
	}

	public static long getLong(long l) {
		return l;
	}

	public static float getFloat(float n) {
		return n;

	}

	public static byte getDyte(byte b) {
		return b;
	}

	public static double getBouble(double d) {
		return d;
	}

	public static boolean getBoolean(boolean bool) {
		return bool;
	}

	public static char getChar(char c) {
		return c;
	}

	public static short getShort(short s) {
		return s;
	}

}
