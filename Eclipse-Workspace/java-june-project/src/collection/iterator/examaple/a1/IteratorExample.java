package collection.iterator.examaple.a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> subjectList;

		subjectList = new ArrayList();
		subjectList = Arrays.asList("java", "python", "sql", null, "html");
		System.out.println(subjectList);

		Iterator<String> iterator = subjectList.iterator();

		boolean isTrueOrFalse = iterator.hasNext();
		// hasNext()
		// returns true if the iteration has more element
		// otherwise false
		System.out.println(isTrueOrFalse);

		String element;
		// next()
		// returns the element in the iterator

		element = iterator.next();

		System.out.println(element);
		element = iterator.next();

		System.out.println(element);
		element = iterator.next();

		System.out.println(element);
		// access all the element using

		while (iterator.hasNext()) {
			String el = iterator.next();
			System.out.println(el + ",");
		}

	}

}
