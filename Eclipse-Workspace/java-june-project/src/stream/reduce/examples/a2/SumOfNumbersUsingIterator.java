package stream.reduce.examples.a2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumOfNumbersUsingIterator {
	// 4,5,6,7,8
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4, 5, 6, 7, 8);
		System.out.println(numberList);
		Integer total=0;
		Iterator<Integer> iterator = numberList.iterator();

		while(iterator.hasNext()) {
			Integer number = iterator.next();
			
			if (number >5) {
				total = total + number;
				
			}
		}
		System.out.println(total);
	}
}
