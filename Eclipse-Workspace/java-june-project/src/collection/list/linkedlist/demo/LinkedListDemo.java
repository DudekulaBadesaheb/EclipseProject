package collection.list.linkedlist.demo;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> movieList = new LinkedList<>();
		System.out.println(movieList);

		// add(element)
		// appends the specified element to the end of linked list
		movieList.add("The Mask");
		movieList.add("Titanic");
		movieList.add("Jurassic Park");
		movieList.add("Fast and Furious");
		movieList.add("Barbie");
		movieList.add("My Fault");
		movieList.add(null);

		System.out.println(movieList);

		String element;
		// getFirst()
		// returns the first element in this linked list
		element = movieList.getFirst();
		System.out.println("getFirst: " + element);

		// getLast()
		// returns the last element in this linked list
		element = movieList.getLast();
		System.out.println("getLast: " + element);

		// set(index, newValue)
		// updates the element using index as argument
		// returns the previous element at the specified position
		element = movieList.set(3, "Spiderman");
		System.out.println(element);
		System.out.println(movieList);

		// removeFirst()
		// removes and returns the first element in this linked list
		element = movieList.removeFirst();
		System.out.println(element);
		System.out.println(movieList);

		// removeLast()
		// removes and returns the last element from this linked list
		element = movieList.removeLast();
		System.out.println(element);
		System.out.println(movieList);

		Integer index;
		// indexOf(element)
		// returns the index of the specified element in this linked list
		// or -1 if this linked list does not contain the element
		index = movieList.indexOf("Titanic");
		System.out.println(index);

		Boolean isTrueOrFalse;
		// contains(element)
		// returns true if this linked list contains the specfied element
		isTrueOrFalse = movieList.contains("Spiderman");
		System.out.println(isTrueOrFalse);

		// remove()
		// removes and returns the head (first element) of this linked list
		element = movieList.remove();
		System.out.println(element);
		System.out.println(movieList);

		// peek()
		// returns the head of this linked list
		// or null if this linked list is empty
		element = movieList.peek();
		System.out.println(element); // Jurassic Park

		// poll()
		// removes the head (first element) of this linked list
		// returns the head of this linked list
		// or null if the linked list is empty
		element = movieList.poll();
		System.out.println(element); // Jurassic Park
		System.out.println(movieList);

		// pop()
		// removes and returns the first element of this linked list
		element = movieList.pop();
		System.out.println(element);
		System.out.println(movieList);

		// push()
		// inserts the element at the front of this list
		movieList.push("A Beautiful Mind");
		System.out.println(movieList);

		Integer size;
		// size()
		// returns the number of elements in this list
		size = movieList.size();
		System.out.println(size); // 3

		// clear()
		// removes all of the elements from this list
		movieList.clear();
		System.out.println(movieList);

		// isEmpty()
		// returns true if this linked list contains no elements
		isTrueOrFalse = movieList.isEmpty();
		System.out.println(isTrueOrFalse); // true
	}
}
