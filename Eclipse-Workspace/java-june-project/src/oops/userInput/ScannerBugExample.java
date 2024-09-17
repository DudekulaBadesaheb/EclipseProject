package oops.userInput;

import java.util.Scanner;

public class ScannerBugExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number:");
		int number = scanner.nextInt();
		System.out.println("Number enter is:" + number);
		// add empty nextLine so as
		scanner.nextLine();

		System.out.print("Enter text:");
		String text = scanner.nextLine();
		System.out.println("Text entered is:" + text);
		scanner.close();

	}

}
