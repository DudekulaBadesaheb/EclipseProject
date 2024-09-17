package oops.methods.overlading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		getData("java");
		getData(630546);
		getData("java", 630546);
		getData(630546, "java");
	}

	public static void getData(String text) {
		System.out.println(text);
	}

	public static void getData(int Number) {
		System.out.println(Number);
	}

	public static void getData(String text, int Number) {
		System.out.println(text + Number);
	}

	public static void getData(int Number, String text) {
		System.out.println(Number + text);
	}

}
