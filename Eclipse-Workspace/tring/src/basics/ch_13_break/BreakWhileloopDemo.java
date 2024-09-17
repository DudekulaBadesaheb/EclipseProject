package basics.ch_13_break;

public class BreakWhileloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1;
		while (counter < 11) {
			System.out.println(counter);
			counter++;
			if (counter == 5) {
				break;

			}

		}
	}

}
