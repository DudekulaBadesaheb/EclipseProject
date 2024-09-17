package stream.filter.examples.a1;

import java.util.Arrays;
import java.util.List;

public class FilterWithIntegerExample {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(5, 6, 7, 8, 9, 10);
		numberList.stream().filter(n -> n % 5 == 0).forEach(System.out::println);
	}
}
