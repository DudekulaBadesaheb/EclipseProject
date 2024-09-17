package basics.ch_12_switch;

public class SwitchWithStringDemo {

	public static void main(String[] args) {
		String monthName = "MARCH";

		switch (monthName) {
		case "JANUARY":
			System.out.println(31);
			break;
		case "FEBRUARY":
			System.out.println(28);
			break;
		case "MARCH":
			System.out.println(31);
			break;
		case "APRIL":
			System.out.println(30);
			break;
		case "MAY":
			System.out.println(31);
			break;
		case "JUNE":
			System.out.println(30);
			break;
		case "JULY":
			System.out.println(31);
			break;
		case "AUGUST":
			System.out.println(31);
			break;
		case "SEPTEMBER":
			System.out.println(30);
			break;
		case "OCTOBER":
			System.out.println(31);
			break;
		case "NOVEMBER":
			System.out.println(30);
			break;
		case "DECEMBER":
			System.out.println(31);
			break;
		default:
			System.out.println("ENTER VALID MONTH NAME");
		}
	}
}
