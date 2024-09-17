package lambdas;

import java.util.List;

public class OddNumbers {

	public static void main(String[] args) {
		List<Integer> number=List.of(2,5,5,6,4,64,9,5,12);
		Obbnumbers(number);

	}
	private static void Obbnumbers(List<Integer>numbers) {
		numbers.stream().filter(number -> number %2!=0).forEach(System.out::println);
		
	}

}
