package basics.ch_14_continue;

public class ContinueWithWhileLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 10 except 5

		int counter = 1;
		while (counter < 11) {

			if (counter == 5) {
				counter++;
				continue;
			}

			System.out.println(counter); // 1 2 3 4
			counter++;
		}
	}
}
