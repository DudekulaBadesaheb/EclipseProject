package basics.ch_14_continue;

public class ContinueWithForLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 10 except 5

		for (int counter = 1; counter < 11; counter++) {
			if (counter == 5) {
				// counter++;
				continue;
			}
			System.out.println(counter);
			// counter++;
		}

	}

}
