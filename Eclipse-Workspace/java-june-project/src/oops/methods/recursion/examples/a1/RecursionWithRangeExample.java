package oops.methods.recursion.examples.a1;

public class RecursionWithRangeExample {

	// add numbers from x to y
	// e.g. add numbers from 2 to 5
	// 2 + 3 + 4 + 5
	// 5 + 4 + 3 + 2
	public static void main(String[] args) {
		int result = sum(2, 5);
		System.out.println(result);

	}

	public static int sum(int start, int end) {
		// 2, 5 // 2, 4 // 2, 3 // 2, 2
		int result = 0;
		if (end > start) {
			result = end + sum(start, end - 1);
			// 5 + sum(2, 5 - 1) => 5 + sum(2, 4)
			// 5 + 4 + sum(2, 4- 1) => 5 + 4 + sum(2, 3)
			// 5 + 4 + 3 + sum(2, 3 - 1) => 5 + 4 + 3 + sum(2, 2)
			// 5 + 4 + 3 + 2
		} else {
			return end;
		}
		return result;
	}

}
