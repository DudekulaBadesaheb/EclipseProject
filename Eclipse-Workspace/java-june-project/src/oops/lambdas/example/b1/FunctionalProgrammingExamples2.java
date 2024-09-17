package oops.lambdas.example.b1;

import java.util.List;

public class FunctionalProgrammingExamples2 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printAllNumbersInListStructured(numbers);
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// functional Programming
		// What to do
		numbers.stream()
		
		.forEach(System.out::println);// method Reference
		
		
		
		// How to loop the numbers
//		for (int number : numbers) {
//			System.out.println(number);
//
//		}
	}// end main method
	
//	private static void print(int number) {
//		System.out.println(number);
//		
//	}

}
