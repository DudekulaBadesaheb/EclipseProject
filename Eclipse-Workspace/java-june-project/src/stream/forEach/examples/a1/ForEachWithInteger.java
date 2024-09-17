package stream.forEach.examples.a1;

import java.util.Arrays;
import java.util.List;

public class ForEachWithInteger {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(2,34,6,8,10);
		numberList.stream().forEach(n -> System.out.println(n));

	}

}
