package basics.ch_08_strings;

public class StringConcacatenationDemo {

	public static void main(String[] args) {
		String subject = "python";
		System.out.println(subject);

		String newsubject = new String("java");
		System.out.println(newsubject);
		// python
		// 012345 : index
		// joining string +int =>string
		System.out.println("java" + 10);
		System.out.println("sun" + "shine");
		String NumberText = 4 + "";
		System.out.println(NumberText);

		String subject2;
		subject2 = subject + 10;
		System.out.println(subject2);
		subject2 = subject + "programming" + (2 * 5);
		System.out.println(subject2);
		subject2 = subject + " programming";
		System.out.println(subject2);
		subject2 = subject + " " + "programming";
		System.out.println(subject2);
// concat()
		System.out.println("python".concat("programming"));
		subject2 = "python".concat(" programming");
		subject2 = "python".concat(" " + "programming");
		System.out.println(subject2);

		subject2 = subject + " : " + newsubject;
		System.out.println(subject2);
	}

}
