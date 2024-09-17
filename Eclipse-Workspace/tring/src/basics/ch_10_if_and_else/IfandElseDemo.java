package basics.ch_10_if_and_else;

public class IfandElseDemo {

	public static void main(String[] args) {

		// if and else
		// control statements
		if (true) {
			System.out.println("condition was true ");
		} else {
			System.out.println(" condition was false");
		}

		if (false) {
			System.out.println("condition was true ");
		} else {
			System.out.println(" condition was false");
		}
// this is not a best practice
		if (true)
			System.out.println("1: true");
		if (false)
			System.out.println("2: true");
		System.out.println("2: false");
		if (false) {
			System.out.println("3: true");
		} else if (true) {
			System.out.println("3: else if true");
		} else {
			System.out.println("3: else false");
		}
	}
} // end method()
