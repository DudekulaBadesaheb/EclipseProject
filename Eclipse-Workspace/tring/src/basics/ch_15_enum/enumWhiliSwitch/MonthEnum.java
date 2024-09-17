package basics.ch_15_enum.enumWhiliSwitch;

public class MonthEnum {
	public static void main(String[] args) {
		
	
	Manth monthName = Manth.MAY;
	switch (monthName) {
	case JANUARY:
		System.out.println(31);
		break;
	case FEBRAUARY:
		System.out.println(28);
		break;
	case MARCH:
		System.out.println(30);
		break;
	case APRIL:
		System.out.println(31);
		break;
	case MAY:
		System.out.println(31);
		break;
	case JUNE:
		System.out.println(30);
		break;
	case JULY:
		System.out.println(31);
		break;
	case AUGUST:
		System.out.println(31);
		break;
	case SEPTAMBER:
		System.out.println(30);
		break;
	case OCTOMBER:
		System.out.println(31);
		break;
	case NOVEMBER:
		System.out.println(30);
		break;
	case DECEMBER:
		System.out.println(31);
		break;

	}
}

}
