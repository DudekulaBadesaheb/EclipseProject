package basics.ch_13_break;

public class BreakWithForLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 10

		for (int counter = 1; counter < 11; counter++) {
			System.out.println(counter); // 1 2 3 4 5
			// counter++;
			if (counter == 5) {
				break;
			}

		}

	}

}
