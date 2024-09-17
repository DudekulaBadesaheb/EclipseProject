package basics.ch_06_typecasting;

public class TypecastingDemo1 {
	public static void main(String[] args) {
		int intNumber = 10;
		
		System.out.println(intNumber);
		
		double doubleNumber = intNumber;
		
		System.out.println(doubleNumber);
		
		doubleNumber = 1.123456789012345;
		
		System.out.println(doubleNumber);
		
		intNumber = (int) doubleNumber;
		
		System.out.println(intNumber);
		
		float floatNumber = (float) doubleNumber;
		
		System.out.println(floatNumber);
		
		long longNumber = (long) doubleNumber;
		System.out.println(longNumber);
		char charVariable = (char) doubleNumber;
		System.out.println(charVariable);
		short shortNumber = (short) doubleNumber;
		System.out.println(shortNumber);
		byte byteNumber = (byte) doubleNumber;
		System.out.println(byteNumber);
		longNumber = 1_234_567_890L;
		intNumber = (int) longNumber;
		String stringNumber = "21";
		System.out.println(stringNumber + 10);
		intNumber = Integer.parseInt(stringNumber);
		System.out.println(intNumber + 10);

	}

}
