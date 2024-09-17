package basics.ch_11_loops.do_while_loop;

/*
 * do while loop will be executed at least once irrespective of the condition
 */

public class DoWhileLoopDemo {

	public static void main(String[] args) {

		// print numbers from 1 to 5

		int counter = 1;
		do {
			System.out.println(counter);
			counter++;
		} while (counter < 6);
	}
}
