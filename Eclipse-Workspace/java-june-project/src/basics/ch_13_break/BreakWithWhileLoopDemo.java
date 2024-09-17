package basics.ch_13_break;

public class BreakWithWhileLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 10
		
		int counter = 1;
		
		while (counter < 11) {
			System.out.println(counter); // 1 2 3 4 
			counter++;
			
			if(counter == 5) {
				break;
			}
		}

	}

}
