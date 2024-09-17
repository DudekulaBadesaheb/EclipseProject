package oops.methods.overlading;

// method name :getData
// 1st parameter :String text
// 2st parameter :int number
// 3st parameter :String data
public class MetodOverloadingTask {

	public static void main(String[] args) {
		getData("java");
		getData(52552);
		getData("java", 52552);
		getData(52552, "java");
		getData("java", "bade");
		getData("java", 52552, "bade");
		getData(52552, "java", "bade");
		getData("java", "bade", 52552);
	}

	public static void getData(String text) {
		System.out.println(text);
	}

	public static void getData(int number) {
		System.out.println(number);
	}

	public static void getData(String text, int number) {
		System.out.println(text + number);
	}

	public static void getData(int number, String text) {
		System.out.println(number + text);
	}

	public static void getData(String text, String data) {
		System.out.println(text + data);
	}

	public static void getData(String data, int number, String text) {
		System.out.println(data + number + text);
	}

	public static void getData(int number, String data, String text) {
		System.out.println(number + data + text);
	}

	public static void getData(String data, String text, int number) {
		System.out.println(data + text + number);
	}
}
