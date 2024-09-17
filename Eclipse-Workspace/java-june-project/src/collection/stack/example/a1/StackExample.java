package collection.stack.example.a1;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> subjects = new Stack<>();
		System.out.println(subjects);

		boolean flag;
// add(element)
// adds new element to the top of the stack
// returns true if the element is added
		flag = subjects.add("java");
		System.out.println(flag);

		subjects.add("pythone");
		subjects.add("html");
		subjects.add("sql");
		subjects.add("css");
		subjects.add("manual testing");
		subjects.add(null);

		System.out.println(subjects);

// pop()
		// removes the element at the top this stack
		// returns the element at the top of this stack
		String pop = subjects.pop();
		System.out.println(pop);
		System.out.println(subjects);

//push(element)
// pushes an element onto the topof this stack
// returns the element at the top of this stack
		String push = subjects.push("c++");
		System.out.println(push);
		System.out.println(subjects);

//search(element)
// returns value 1 based position from the top of the stack where the element is located
		// returns value -1 which indicates that the element is not on the stack

		int position = subjects.search("css");
		System.out.println(position);
		System.out.println(subjects);

// peek()
//locks at the element at the top of this stack without removing it fro the stack
// returns the  element at the top of the stack
		String peek = subjects.peek();
		System.out.println(peek);

//size(_)
// returns the number of element in this stack
		int size = subjects.size();
		System.out.println(size);

//clear()
		subjects.clear();
		System.out.println(subjects);

// empty()
// tests if this stack is empty
		// returns true if and only this stack contains no element
		boolean empty = subjects.empty();
		System.out.println(empty);

	}

}
