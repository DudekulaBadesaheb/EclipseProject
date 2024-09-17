package oops.wrapperClasses.example.a1;

public class WrapperClassesExample {

	public static void main(String[] args) {
		String stringNumber = "10";
		Integer number = Integer.parseInt(stringNumber);
		System.out.println(number); //

		// Character character1 = new Character('Z'); // Deprecated
		Character character = 'Z';
		System.out.println(character);

		Byte byteNumber = 127;
		System.out.println(byteNumber);

		Short shortNumber = 32767;
		System.out.println(shortNumber);

		Integer intNumber = 100;
		// Integer intNumber2 = new Integer(10); // Deprecated
		System.out.println(intNumber);

		Long longNumber = 1_234_567_890_123L;
		System.out.println(longNumber);

		Float floatNumber = 10.5F;
		System.out.println(floatNumber);

		Double doubleNumber = 100.55;
		System.out.println(doubleNumber);

		Boolean flag = true;
		System.out.println(flag);

	}

}
