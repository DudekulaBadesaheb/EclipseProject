package collection.list.linkedlist.demo;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> movieList = new LinkedList<>();
		System.out.println(movieList);

		// add(element)
		// appends the specified element to the end of linked list
		movieList.add("the Mask");
		movieList.add("Titanic");
		movieList.add("jurassic Park");
		movieList.add("Fast and Furious");
		movieList.add("My Fault");
		movieList.add(null);
		System.out.println(movieList);

		String element;
		// getFirst()
		// return the first element in this linked list
		element = movieList.getFirst();
		System.out.println("get First"+element);

		// getLast()
		// retens the last element in this linked list
		element = movieList.getLast();
		System.out.println(element);

		// set(index, newValue)
		// updates the element using index as argument
		// returns the previous element at the specified position
		element = movieList.set(3, "spiderman");
		System.out.println(element);

		// removeFirst()
		// remove and returns the first element in this linked list
		element = movieList.removeFirst();
		System.out.println(element);
		// removeLast()
		// remove and returns the last element in link linked list
		element = movieList.removeLast();
		System.out.println(element);

		Integer index;
		// indexOf(element)
		// returns the index of the specified element in this linked list
		// or -1 if this linked list does not contain the element
		index = movieList.indexOf("Titanic");
		System.out.println(index);

		Boolean isTrueOrFalse;
		// contains(element)
		// removes true if this linked list contains the specfied element
		isTrueOrFalse = movieList.contains("spiderman");
		System.out.println(isTrueOrFalse);

		// remove()
		// remove and retans the head (first element) of this linked list
		element = movieList.peek();
		System.out.println(element);

		// poll()

		// remove the head (first element)of this linked list
		// returns the head of this linked list
		// or null if the linked list is empty
		element = movieList.poll();
		System.out.println(element);
		System.out.println(movieList);

		// pop()
		// removes and returns the first element of this linked list
		element = movieList.pop();
		System.out.println(element);
		System.out.println(movieList);

		// push()

		// inserts the element at the front of this list
		movieList.push("A beautiful mind");
		System.out.println(movieList);

		Integer size;
		// size()
		// returns the number of element in this list
		size = movieList.size();
		System.out.println(size);

		// clear()
		// removes all of the element from this list
		movieList.clear();
		System.out.println(movieList);

		// is Empty()
		// returns true if this linkd list contains no element
		isTrueOrFalse = movieList.isEmpty();
		System.out.println(isTrueOrFalse);
	}

}
