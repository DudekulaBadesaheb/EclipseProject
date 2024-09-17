package stream.map.example.a1;

import java.util.Arrays;
import java.util.List;

public class MapExample1 {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		numberList.stream().map(number -> number * 2).forEach(System.out::println);
	}

}