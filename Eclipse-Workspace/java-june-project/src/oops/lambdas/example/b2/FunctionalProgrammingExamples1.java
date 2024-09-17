package oops.lambdas.example.b2;

import java.util.List;

public class FunctionalProgrammingExamples1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printEvenNumbersInListStructured(numbers);

	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// functional Programming
		// What to do
		numbers.stream()

				.filter(FunctionalProgrammingExamples1::isEven) // filter - only Allow Even Numbers

				.forEach(System.out::println);// method Reference

	}// end main method

	private static boolean isEven(int number) {
		return number % 2 == 0;

	}

}
