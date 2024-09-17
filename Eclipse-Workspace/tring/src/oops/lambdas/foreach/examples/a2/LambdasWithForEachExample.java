package oops.lambdas.foreach.examples.a2;

import java.util.ArrayList;

public class LambdasWithForEachExample {

	public static void main(String[] args) {
		ArrayList<String> subjectList = new ArrayList<>();
		subjectList.add("java");
		subjectList.add("python");
		subjectList.add("sql");
		subjectList.add("html");

		subjectList.add("c++");
		System.out.println(subjectList);

		// strutured Programing
		for (String subject : subjectList) {
			System.out.println(subject);
		}

		// Functional Programing
		subjectList.forEach((subject) -> {
			System.out.println(subject);
		});
		// Functionnal PPrograming -2
		subjectList.forEach(subject -> System.out.println(subject));

	}

}
