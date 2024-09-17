package stream.collect.examples.a2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectWithIntegerExample {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(numberList);
		List<Integer> squareList = numberList.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(squareList);
		List<Integer> s = numberList.stream().map(n -> n + n).collect(Collectors.toList());
		System.out.println(s);
		List<Integer> sq = numberList.stream().map(n -> n % n).collect(Collectors.toList());
		System.out.println(sq);
		List<Integer> square = numberList.stream().map(n -> n * n^2).collect(Collectors.toList());
		System.out.println(square);
		List<Integer> square2 = numberList.stream().map(n -> n * n^3).collect(Collectors.toList());
		System.out.println(square2);
		List<Integer> square3 = numberList.stream().map(n -> n^4).collect(Collectors.toList());
		System.out.println(square3);
	}

}
