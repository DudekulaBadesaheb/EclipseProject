package oops.lambdas.example.b2;

import java.util.List;

// print all the even numbers in separate line from the list

public class StrucredProgrammingExamples {
	public static void main(String[] args) {
		printEvenNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
	}
	private static void printEvenNumbersInListStructured(List<Integer>numbers) {
		// How to loop the numbers
		for(int number : numbers) {
			// if (even)
			if(number % 2 == 0) {
				System.out.println(number);
			}
			
			
		}
	}

}
