package basics.ch_11_loops.while_loop;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// DRY Principle
		// Do Not Repeat Yourself

		// Loops
		// 1. When to start
		// 2. Code to run
		// 3. When to stop

		// print numbers from 1 to 5
		int counter = 0;
		while (counter < 6) {
			System.out.println(counter);
			// counter = counter + 1; // 1 2 3 4 5
			counter++; // 1 2 3 4 5
		}
	}
}
