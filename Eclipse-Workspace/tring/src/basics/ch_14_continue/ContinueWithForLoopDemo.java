package basics.ch_14_continue;

public class ContinueWithForLoopDemo {

	public static void main(String[] args) {
		// print
		for (int counter = 1; counter < 11; counter++) {
			if (counter == 5) {

				continue;
			}
			System.out.println(counter);

		}

	}

}
