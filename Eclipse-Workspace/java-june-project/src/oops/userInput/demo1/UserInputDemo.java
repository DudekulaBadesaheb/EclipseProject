package oops.userInput.demo1;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter text: ");
		String text = scanner.nextLine();
		System.out.println("Text entered is: " + text);

		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		System.out.println("The number entered is: " + number);

		scanner.close();
	}
}
