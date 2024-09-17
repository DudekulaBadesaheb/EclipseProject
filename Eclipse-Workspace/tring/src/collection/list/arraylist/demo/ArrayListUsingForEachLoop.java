package collection.list.arraylist.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUsingForEachLoop {

	public static void main(String[] args) {
		ArrayList<String> subjectList = new ArrayList<>();
		System.out.println(subjectList);

		// add(element)
		// adds the specified element to the end of this list
		// returns true
		subjectList.add(null);
		subjectList.add("java");
		subjectList.add("sql");
		subjectList.add("ai");
		subjectList.add("pyton");
		subjectList.add("machine learning");
		subjectList.add("java");
		System.out.println(subjectList);

		System.out.print("[");

		for (String subject : subjectList) {

			System.out.print(subject + ",");

		}

		System.out.println("]");
	}

}
