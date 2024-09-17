package oops.staticConcept.demo;

public class Main {

	public static void main(String[] args) {

		StaticClass.subject = "java";
		StaticClass.subject = "python";

		System.out.println(StaticClass.subject);

		int result = StaticClass.addition(2, 4);
		System.out.println(result);

	}

}
