package lambdas;


import java.util.ArrayList;

public class LambdasExampl {
public static void main(String[] args) {
	ArrayList<String> subjects = new ArrayList<>();
	subjects.add("python");
	subjects.add("java");
	subjects.add("sql");
	subjects.add("html");
	subjects.add("css");
	
	System.out.println(subjects);
	
	for(String subjects1: subjects) {
		System.out.println(subjects1);
		
	}
	System.out.println("------------------------------------------------------");
	
	subjects.forEach(
			(subjects2) ->{
				System.out.println(subjects2);
			}
			);
	System.out.println("---------------------------------------------------------");
	subjects.forEach(
			(s)-> System.out.println(s)
			);
	System.out.println("--------------------------------------------------------");
	subjects.forEach(
			s -> System.out.println(s)
			);
	System.out.println("-----------------------------------------------------");
}


}
