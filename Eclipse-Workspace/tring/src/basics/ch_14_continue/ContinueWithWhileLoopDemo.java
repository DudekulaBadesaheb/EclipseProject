package basics.ch_14_continue;

public class ContinueWithWhileLoopDemo {
	public static void main(String[] args) {
		int counter = 1;
		while (counter < 11) {
			if (counter == 5) {
				counter++;
				continue;
			}
			System.out.println(counter);
			counter++;

		}
	}
}
