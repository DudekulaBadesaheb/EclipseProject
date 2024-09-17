package stream.sorted.examples.a2;

import java.util.Arrays;
import java.util.List;

public class SortedWithStringExample {
	// Task
	// sort the following list of cities
	// goa,delhi,mumbai,pune,jaipur,bangalore,hyderabad

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("goa", "delhi", "mumbai", "pune", "jaipur", "bangalore", "hyderabad");
		cities.stream().sorted().forEach(System.out::println);
	}

}
