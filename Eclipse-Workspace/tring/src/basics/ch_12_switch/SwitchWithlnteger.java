package basics.ch_12_switch;

public class SwitchWithlnteger {

	public static void main(String[] args) {
		int dayOfTheWeek = 3;
		// 0 1 2  6 7 8 
		
		switch (dayOfTheWeek) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("thesday");
			break;
		case 3:
			System.out.println("wedneday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("enter values 1 to 7 ");
		}

	}

}
