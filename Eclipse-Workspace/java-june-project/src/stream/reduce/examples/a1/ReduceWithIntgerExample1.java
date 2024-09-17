package stream.reduce.examples.a1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 100.00  105.00 110.50 115.50  120.50 
// sum of all products whose price is more then 105.00
// after discount of 10%
// (110.50 / 1.10) + (115.50 / 1.10) + (120.50 / 1.10)
// total Rs.338.85

public class ReduceWithIntgerExample1 {

	public static void main(String[] args) {
		List<Double> priceList = Arrays.asList(100.00, 105.00, 110.50, 115.50, 120.50);
//		Predicate<? super Double> predicat = price -> price > price >105.00;
		
		Double total=priceList.stream().filter(price -> price >105.00).mapToDouble(price -> price /1.10).sum();
		System.out.println(total);
		System.out.println((110.50 / 1.10) + (115.50 / 1.10) + (120.50 / 1.10));
	}

}
