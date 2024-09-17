package collection.set.hashset.examples.a1;

import java.util.HashSet;

public class HashSetexample {

	public static void main(String[] args) {
		HashSet<String> subjects = new HashSet<>();
		System.out.println(subjects);

		boolean flag;
		// add(element)
		// add the specified element to this set if it is not already present
		// returns true if the element is present.
		// returns if the element is present
		flag = subjects.add("java");
		System.out.println(flag);

		flag = subjects.add("java");
		System.out.println(flag);
		subjects.add("python");
		subjects.add("sql");
		subjects.add("html");
		subjects.add("sql");
		
		subjects.add("manual testing");
		System.out.println(subjects);
		// contains(element)
		// returns true if this set contains the specified element
		flag = subjects.contains("java");
		System.out.println(flag);
		
		flag = subjects.contains("ai");
		System.out.println(flag);
		
		// remove (element)
		// removes the specified element from this set if this is present
		// returns true if the set contains the specified element
		
		flag = subjects.remove("manual testing");
		System.out.println(flag);
		
		//size ()
		// returns the number of elements in this set
		int size = subjects.size();
		System.out.println(size);
		
		// clear()
		// removes all of the element from this set
		subjects.removeAll(subjects);
		//or
		subjects.clear();
		// isEmpty
		
		
		flag = subjects.isEmpty();
		System.out.println(flag);
		
		

	}

}
