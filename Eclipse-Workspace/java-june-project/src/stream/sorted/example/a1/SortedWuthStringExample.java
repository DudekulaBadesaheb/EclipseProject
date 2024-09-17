package stream.sorted.example.a1;

import java.util.Arrays;
import java.util.List;

public class SortedWuthStringExample {

	public static void main(String[] args) {
		List<String> subjectList = Arrays.asList("java","sql","python","ai","html");
		subjectList.stream().sorted().forEach(System.out::println);

	}

}
