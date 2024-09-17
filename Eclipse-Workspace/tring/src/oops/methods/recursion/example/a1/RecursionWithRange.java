package oops.methods.recursion.example.a1;

public class RecursionWithRange {

	// add numbers upto X
	// e.g. add number upto 5
	// 0 + 1 + 2 + 3 + 4 + 5
	// 5 + 4 + 3 + 2 + 1 + 0
	// 5 + 4 = > SUM(x) + SUM(x-1)

	public static void main(String[] args) {
		int result = sum(5);
		System.out.println(result);

	}

	public static int sum(int x) { // 5 // 4
		int result = 0;
		if (x > 0) {
			result = x + sum(x - 1);
			//  5  + sum(5-1) => 5 + sum(4)
		//  5 + 4 + sum(4-1) => 5 + 4 + sum(3)
	// 5 + 4 + 3 + sum(3 - 1) => 5 + 4 + 3 + sum(2)
// 5 + 4 + 3 + 2 + sum(2 - 1) => 5 + 4 + 3 + 2 + sum(1)
// 5 + 4 + 3 + 2 + sum(1 - 1) => 5 + 4 + 3 + 2 + sum(0)
		} else {
			return x;
		}
		return result;

	}

}
