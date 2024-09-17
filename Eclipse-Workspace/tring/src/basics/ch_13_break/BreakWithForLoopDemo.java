package basics.ch_13_break;

public class BreakWithForLoopDemo {

	public static void main(String[] args) {
		for(int counter=1; counter < 11 ;counter++) {
			System.out.println(counter);
			// counter++;
			if(counter==5) {
				break;
			}
		}

	}

}
