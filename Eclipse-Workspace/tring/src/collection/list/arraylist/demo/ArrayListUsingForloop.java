package collection.list.arraylist.demo;

import java.util.ArrayList;

public class ArrayListUsingForloop {

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
		Integer size = subjectList.size();
		
		for(int index=0; index< size; index++) {
			String subject = subjectList.get(index);
			System.out.print(subject+",");
		}
		System.out.println();
		// accesing the elements from the end using for loop
		for (int index = size -1; index >-1; index--) {
			String subject = subjectList.get(index);
			System.out.print(subject+",");
		}
		System.out.println();

	}

}
