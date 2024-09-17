package stream.filter.a2;

import java.util.stream.Stream;

// create a stream of  of number from 1 to 10
// filter even number and show them in console one by one
public class FilterWithIntegerExample {
	public static void main(String[] args) {
		Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numberStream.filter(s -> s % 2 == 0).forEach(System.out::println);
//		numberStream.filter(p -> p + 2 ==0).forEach(System.out::println);
	}
}
