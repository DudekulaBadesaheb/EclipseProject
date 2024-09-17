package collection.set.treeset;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> subjects =new TreeSet<>();
		System.out.println();
		
		subjects.add("java");
		subjects.add("pythone");
		subjects.add("sql");
		subjects.add("html");
		subjects.add("css");
//		subjects.add(null);// it will throw NullPointerException
		
		System.out.println(subjects);
		
		subjects.add("java");// duplicate values will not be inserted
		
		System.out.println(subjects);//sorting order(ascending
		

	}

}
