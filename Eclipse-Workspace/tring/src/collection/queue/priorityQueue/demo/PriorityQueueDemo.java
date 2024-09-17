package collection.queue.priorityQueue.demo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> subjectQueue = new PriorityQueue<>();
		System.out.println(subjectQueue);

		        // add(elements)
				// adds an element to the rear of the queue
				// inserts the specified element is added to the queue
				// if the queue is full , it throws an exception
		Boolean isTrueOrFalse;
		isTrueOrFalse = subjectQueue.add("java");
		System.out.println(isTrueOrFalse);

		subjectQueue.add("python");
		subjectQueue.add("c++");
		subjectQueue.add("ai");
		subjectQueue.add("machin lerning");
		subjectQueue.add("sql");
		subjectQueue.add("manual testing");

		System.out.println(subjectQueue);
		// This one will throw NullPOinterException
				// subjectQueue.add(null);
		String element;
		// poll()
		// remove the head of this queue
		// returns the head of this queue
		// returns null if this queue is empty.
		element = subjectQueue.poll();
		System.out.println(element);
		System.out.println(subjectQueue);

		// peek()
		// returns,but not remove ,the head of this queue
		// or returns nill if this queue isempty
		element = subjectQueue.peek();
		System.out.println(element);
		
		// remove()
		// removes and returns the head of this queue
		// this methide differs from poll in that
		// it throws an Exception if this queue is empty
		element = subjectQueue.remove();
		System.out.println(element);
		System.out.println(subjectQueue);
		
		Integer size;
		// contains (element)
		// returns the total number of elements in this queue
		size=subjectQueue.size();
		System.out.println(size);
		
		// offer(element)
		// adds an element to the rear  of the queue.
		// if the queue is full .it returns false
		isTrueOrFalse =subjectQueue.offer("html");
		System.out.println(isTrueOrFalse);
		System.out.println(subjectQueue);
		
		
		//element()
		// returns the element at the front of the queue without removing it.
		// if the queue is empty,it throws an exception
		element= subjectQueue.element()
;
		System.out.println(element);
		
	
	// clear()
	// removes all the element form this queue
		subjectQueue.clear();
		System.out.println(subjectQueue)
		;
		
		//isEmpty()
		// returns true if this queue contains no elements
		isTrueOrFalse=subjectQueue.isEmpty();
		System.out.println(isTrueOrFalse);
	}

}
