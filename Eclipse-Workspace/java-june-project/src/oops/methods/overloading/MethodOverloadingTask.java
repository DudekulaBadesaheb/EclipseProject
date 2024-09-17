package oops.methods.overloading;

public class MethodOverloadingTask {

	public static void main(String[] args) {
		// method name : getData
		// 1st parameter : String text
		// 2nd parameter : int number
		// 3rd parameter : String data
		getData("badesaheb");
		getData(122212);
		getData("badesaheb",232222);
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

	public static void getData(String text, int number, String data) {
		System.out.println(text + number + data);
	}

	public static void getData(String text, String data, int number) {
		System.out.println(text + data + number);
	}

	public static void getData(int number, String data, String text) {
		System.out.println(number + data + text);
	}

}
