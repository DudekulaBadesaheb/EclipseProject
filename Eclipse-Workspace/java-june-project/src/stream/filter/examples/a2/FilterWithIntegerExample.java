package stream.filter.examples.a2;

import java.util.stream.Stream;

public class FilterWithIntegerExample {

	// Create a stream of numbers from 1 to 10
	// filter even numbers and show them in console one by one

	public static void main(String[] args) {
		Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numberStream.filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
