package basics.ch_09_arrays;

public class ArrayOfInteger {

	public static void main(String[] args) {
		int[] numberArray = { 1, 2, 3, 4, 5 }; // 1 way
		// index 0 1 2 3 4

		System.out.println(numberArray[0]); // 1
		numberArray[4] = 10;

		System.out.println(numberArray[4]); // 10

		int rollNumberArray[] = { 100, 101, 102, 103 }; // 2 way

		int[] mobileNumberArray = new int[2]; // 3 way

		int[] registerNumberArray = new int[] { 1001, 1002 }; // 4 way

		// ArrayIndexOutOfBoundsException
		int number = numberArray[5];
		System.out.println(number);
	}

}
