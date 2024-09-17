package basics.ch_12_switch;

public class SwitchWithIntegerDemo {

	public static void main(String[] args) {
		int dayOfTheWeek = 8;
		//  test values 0 1 2 6 7 8

		switch (dayOfTheWeek) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("ENTER VALUES 1 TO 7");
		}
	}
}
