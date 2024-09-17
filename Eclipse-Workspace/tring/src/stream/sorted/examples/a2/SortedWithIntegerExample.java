package stream.sorted.examples.a2;
// task
// sort the following list of pincode
// 560080,560076,560100,560040

import java.util.Arrays;
import java.util.List;

public class SortedWithIntegerExample {

	public static void main(String[] args) {
		List<Integer> numbrList =  Arrays.asList(560080,560100,560076,560050,560040);
		numbrList.stream().sorted().forEach(System.out::println);
	}

}
