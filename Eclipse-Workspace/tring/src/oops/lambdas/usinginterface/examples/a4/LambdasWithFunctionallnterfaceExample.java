package oops.lambdas.usinginterface.examples.a4;

import java.util.ArrayList;

public class LambdasWithFunctionallnterfaceExample {

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
			System.out.println("subject:"+subject);
		}
		
		//lambda expression
		subjectList.forEach(
				(subject) ->{
					System.out.println(subject+",");
				}
				);
		
		System.out.println();
		
		subjectList.forEach(
				(subject) ->
					System.out.println(subject+",")
			);
		subjectList.forEach(
				subject ->
					System.out.println(subject+",")
			);
	}
}