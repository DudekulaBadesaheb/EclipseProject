package basics.ch_09_arrays;

import java.util.Arrays;

public class ArrayOfString {

	public static void main(String[] args) {
		String[] subjectArray = { "java", "c", "c++", "python", "ai" };
		String stateArray[] = { "KA", "AP", "TS", "TN", "KL" };
		String[] nameArray = new String[10];
		String cityArray[] = new String[4];
		String petArray[] = new String[] { "fish", "dog", "cat", "camel" };

		System.out.println(subjectArray);
		System.out.println(Arrays.toString(subjectArray));

		// You can access an array element by index number
		// Array indexes start with 0
		System.out.println(subjectArray[0]); // java

		// To change the value of a specific element,
		// refer to the index number
		System.out.println(subjectArray[4]); // ai
		subjectArray[4] = "sql";
		System.out.println(subjectArray[4]); // sql

		// To find out how many elements an array has,
		// use the length property
		int size = subjectArray.length;
		System.out.println(size);

		// index of last element is array.length minus one
		System.out.println("index of last element: " + (size - 1));
	}
}
