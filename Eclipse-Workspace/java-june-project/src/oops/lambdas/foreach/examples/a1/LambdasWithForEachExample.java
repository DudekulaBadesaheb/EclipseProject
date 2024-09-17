package oops.lambdas.foreach.examples.a1;

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

		// normal code
		for (String subject : subjectList) {
			System.out.println("Subject: " + subject);
		}

		// lambda expression
		subjectList.forEach(

				(subject) -> {
					System.out.print(subject + ", ");
				}

		);

		System.out.println();

		subjectList.forEach(

				subject -> System.out.print(subject + ", ")

		);

	}

}
