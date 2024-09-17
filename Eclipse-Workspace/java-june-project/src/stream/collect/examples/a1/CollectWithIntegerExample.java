package stream.collect.examples.a1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectWithIntegerExample {

	public static void main(String[] args) {
		List<Integer>numberList;
		numberList = Arrays.asList(5,2,3,4,5);
		System.out.println(numberList);
		numberList = numberList.stream().sorted().collect(Collectors.toList());
		System.out.println(numberList);

	}

}
