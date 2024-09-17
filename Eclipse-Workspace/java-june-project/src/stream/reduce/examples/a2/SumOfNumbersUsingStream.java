package stream.reduce.examples.a2;

import java.util.List;

public class SumOfNumbersUsingStream {
	// write programing using iterator to calculate
	// sum of number greater then 5
	// 1,2,3,4,5,6,7,8
	// 6,7,8
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
		int total=numbers.stream()
				.filter(number->number>5)
				.mapToInt(number -> number)
				.sum();
		System.out.println(total);
	}

}
