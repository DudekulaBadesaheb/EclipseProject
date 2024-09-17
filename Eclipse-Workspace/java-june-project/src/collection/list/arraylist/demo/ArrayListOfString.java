package collection.list.arraylist.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfString {

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
		subjectList.add("python");
		subjectList.add("machine learning");
		subjectList.add("java");

		System.out.println(subjectList);

		// size()
		// returns the number of elements in this list
		Integer size = subjectList.size();
		System.out.println(size); // 7

		String element;
		// get(index)
		// returns the element using index as argument
		element = subjectList.get(6);
		System.out.println(element); // java

		// set(index, newValue)
		// updates the element using index as argument
		// returns the previous element at the specified position
		element = subjectList.set(6, "devops");
		System.out.println(element); // java

		Boolean isTrueOrFalse;
		// contains("element")
		// returns true if this list contains the specified element
		isTrueOrFalse = subjectList.contains("html");
		System.out.println(isTrueOrFalse); // false

		// remove(element)
		// removes specified element from list, if it is present
		// returns true if this list contains the specified element
		isTrueOrFalse = subjectList.remove("ai");
		System.out.println(isTrueOrFalse); // true

		// remove(index)
		// removes the element at the specified position in this list
		// returns the element that was removed from the list
		element = subjectList.remove(0);
		System.out.println(element); // null

		System.out.println(subjectList);

		// Collections.sort(arrayList)
		// returns sorted arrayList
		Collections.sort(subjectList);
		System.out.println(subjectList);

		// clear()
		// deletes all the elements from the list
		subjectList.clear();

		System.out.println(subjectList);

		// isEmpty()
		// returns true if list contains no elements
		isTrueOrFalse = subjectList.isEmpty();
		System.out.println(isTrueOrFalse);

	}

}
