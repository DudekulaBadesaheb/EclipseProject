package oops.lambdas.example.b3;

import java.util.List;

// print odd numbers from this list using functional programming - lambdas
// 12,9,13,4,6,2,4,12,15
public class FpTask01 {

	public static void main(String[] args) {
	List<Integer> numbers=List.of(12,9,13,4,6,5,2,4,12,15);
	oddnumbers(numbers);

	}
private static void oddnumbers(List<Integer> numbers) {
	numbers.stream()
	.filter(number -> number  %2!=0)
.forEach(System.out::println);
}
	

	

	
	
}


