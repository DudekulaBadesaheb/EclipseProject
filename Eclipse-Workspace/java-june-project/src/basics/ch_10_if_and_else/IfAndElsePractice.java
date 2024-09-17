package basics.ch_10_if_and_else;

public class IfAndElsePractice {

	public static void main(String[] args) {
		// PRINT "CHILD" if age is more than or equal to 0 but less than 12
		// PRINT "TEEN" if age is more than or equal to 12 but less than 18
		// PRINT "ADULT" if age is more than 18 or equal to 18 but less than 50
		// PRINT "SENIOR" if age is more than 50 or equal to 50 but less than 127
		// PRINT "ENTER VALUES BETWEEN 0 AND 127" for all other values

		int age = 127;

		if (age >= 0 && age < 12) {
			System.out.println("CHILD");
		} else if (age >= 12 && age < 18) {
			System.out.println("TEEN");
		} else if (age >= 18 && age < 50) {
			System.out.println("ADULT");
		} else if (age >= 50 && age < 127) {
			System.out.println("SENIOR");
		} else {
			System.out.println("ENTER VALUES BETWEEN 0 AND 127");
		}

	}

}
