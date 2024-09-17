package oops.lambdas.example.b3;

import java.util.List;

// Write a program using Functional Programming - lambda Expression
// print subject containing "spring " from the list
//" spring","spring boot","azure","docker","kubernates"
public class FPTask02 {

	public static void main(String[] args) {
		 subjects2 (List.of("spring","spring boot","azure","docker","kubernates"));
		

	}
	private static void subjects2(List<String>subjects) {
		subjects.stream().filter(subject ->subject.contains("spring")).forEach(System.out::println);
		
	}
	
}
