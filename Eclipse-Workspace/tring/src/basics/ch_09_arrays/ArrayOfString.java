
package basics.ch_09_arrays;

import java.util.Arrays;

public class ArrayOfString {

	public static void main(String[] args) {
		String[] subjectArray = { "java", "c", "c++", "python", "ai" };
		String stateArray[] = { "ka", "ap", "ts", "tn", "kl" };
		String[] nameArray = new String[10];
		String cityArray[] = new String[4];
		String petArray[] = new String[] { "fish", "dog", "cat", "camel" };
		System.out.println(subjectArray);
		System.out.println(Arrays.toString(subjectArray));
		System.out.println(subjectArray[0]);
		System.out.println(subjectArray[4]);
		subjectArray[4] = "sql";
		System.out.println(subjectArray[4]);

		int size = subjectArray.length;
		System.out.println(size);
		System.out.println("index of last element:" + (size -1));

	}

}
