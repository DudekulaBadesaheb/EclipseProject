package collection.list.arraylist.demo;

import java.util.ArrayList;

public class ArrayListOfInteger {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();

		// add(Integer)

		numberList.add(0);
		numberList.add(null);
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);

		System.out.println(numberList);

		// fetch elements of array list using for loop
		// size()
		// Returns the number of elements in this list.

		Integer size = numberList.size();
		for (int index = 0; index < size; index++) {
			Integer number = numberList.get(index);
			System.out.print(number + ", ");
		}

	}
}
