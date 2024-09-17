package oops.lambdas.foreach.examples.b1;

import java.util.ArrayList;

// Functional Programming X Structured Programming

public class LambdasWithForEachExample {

	public static void main(String[] args) {
		ArrayList<String> subjectList = new ArrayList<>();
		subjectList.add("java");
		subjectList.add("python");
		subjectList.add("sql");
		subjectList.add("html");
		subjectList.add("c++");

		System.out.println(subjectList);

		// Structured Programming
		for (String subject : subjectList) {
			System.out.println(subject);
		}

		// Functional Programming - 1
		subjectList.forEach(	
				
				(subject) -> {
					System.out.println(subject);
				}		
				
				);
		
		// Functional Programming - 2
		subjectList.forEach(subject -> System.out.println(subject));		
	}
}
