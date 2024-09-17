package basics.ch_11_loops.for_each_loop;

// For Each Loop // Modified For Loop // Enhanced For Loop

public class ForEachLoopDemo {

	public static void main(String[] args) {
		String[] subjectArray = { "java", "sql", "html", "pythom", "ai" };

		for (String subject : subjectArray) {
			System.out.print(subject + ", ");
		}
	}
}