package basics.ch_08_strings;

public class StringConcatenationDemo {

	public static void main(String[] args) {
		String subject = "python";
		System.out.println(subject); // python

		String newSubject = new String("java");
		System.out.println(newSubject); // java

		// python
		// 012345 : index

		// joining String + int => String
		System.out.println("java" + 10); // java10

		// joining String + String => String
		System.out.println("sun" + "shine"); // sunshine

		// 14 + "" => "14"
		String numberText = 14 + "";
		System.out.println(numberText); // "14"

		String subject2;
		subject2 = subject + 10;
		System.out.println(subject2); // python10

		subject2 = subject + "programming";
		System.out.println(subject2); // pythonprogramming

		// python programming
		subject2 = subject + " programming"; // python programming
		subject2 = subject + " " + "programming";
		System.out.println(subject2);

		// concat()
		System.out.println("python".concat(" programming"));
		subject2 = "python".concat(" programming");
		subject2 = "python".concat(" " + "programming");
		System.out.println(subject2);
		
		subject2 = subject + " : " + newSubject;
		System.out.println(subject2); // python : java
	}
}
