package collection.queue.priorityQueue.demo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> subjectQueue = new PriorityQueue<>();
		System.out.println(subjectQueue);

		Boolean isTrueOrFalse;
		// add(element)
		// adds an element to the rear of the queue
		// inserts the specified element into this queue
		// returns true if the element is added to the queue
		// if the queue is full, it throws an exception
		isTrueOrFalse = subjectQueue.add("java");
		System.out.println(isTrueOrFalse);

		subjectQueue.add("python");
		subjectQueue.add("c++");
		subjectQueue.add("ai");
		subjectQueue.add("machine learning");
		subjectQueue.add("sql");
		subjectQueue.add("manual testing");

		// This one will throw NullPointerException
		// subjectQueue.add(null);

		System.out.println(subjectQueue);

		String element;
		// poll()
		// removes the head of this queue
		// returns the head of this queue
		// returns null if this queue is empty.
		element = subjectQueue.poll();
		System.out.println(element);
		System.out.println(subjectQueue);

		// peek()
		// returns, but not remove, the head of this queue,
		// or returns null if this queue is empty
		element = subjectQueue.peek();
		System.out.println(element);

		// remove()
		// removes and returns the head of this queue.
		// This method differs from poll in that
		// it throws an Exception if this queue is empty
		element = subjectQueue.remove();
		System.out.println(element);
		System.out.println(subjectQueue);

		// contains(element)
		// returns true if this queue contains the specified element
		isTrueOrFalse = subjectQueue.contains("java");
		System.out.println(isTrueOrFalse);

		Integer size;
		// size()
		// returns the total number of elements in this queue
		size = subjectQueue.size();
		System.out.println(size);

		// offer(element)
		// adds an element to the rear of the queue.
		// if the queue is full, it returns false
		isTrueOrFalse = subjectQueue.offer("html");
		System.out.println(isTrueOrFalse);
		System.out.println(subjectQueue);

		// element()
		// returns the element at the front of the queue without removing it.
		// if the queue is empty, it throws an exception.
		element = subjectQueue.element();
		System.out.println(element);

		// clear()
		// removes all the elements from this queue
		subjectQueue.clear();
		System.out.println(subjectQueue);

		// isEmpty()
		// returns true if this queue contains no elements
		isTrueOrFalse = subjectQueue.isEmpty();
		System.out.println(isTrueOrFalse);

	}

}
