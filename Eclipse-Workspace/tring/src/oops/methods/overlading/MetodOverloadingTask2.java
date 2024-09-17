package oops.methods.overlading;

//method name :getData
//1st parameter :String text
//2st parameter :int number
//3st parameter :String data
//4st parameter :float points
public class MetodOverloadingTask2 {

	public static void main(String[] args) {

	}

	public static void getData(String text) {
		System.out.println(text);

	}

	public static void getData(int number) {
		System.out.println(number);
	}

	public static void getData(float points) {
		System.out.println(points);
	}

	public static void getData(String args, int number) {
		System.out.println(args + number);
	}

	public static void getData(int number, String args) {
		System.out.println(number + args);
	}

	public static void getData(String args, float points) {
		System.out.println(args + points);
	}

	public static void getData(float points, String args) {
		System.out.println(points + args);
	}

	public static void getData(String args, String text) {
		System.out.println(args + text);
	}

	public static void getData(String args, String text, int numbers) {
		System.out.println(args + text + numbers);
	}

	public static void getData(int number, String args, String text) {
		System.out.println(number + args + text);
	}

	public static void getData(String args, int number, String text) {
		System.out.println(args + number + text);
	}

	public static void getData(String args, String text, float points) {
		System.out.println(args + text + points);
	}

	public static void getData(String args, float points, String text) {
		System.out.println(args + points + text);
	}

	public static void getData(float points, String args, String text) {
		System.out.println(points + args + text);
	}

	public static void getData(float points, int number, String args) {
		System.out.println(points + number + args);
	}

	public static void getData(float points, String text, int number) {
		System.out.println(points + text + number);
	}

	public static void getData(int number, float points, String text) {
		System.out.println(number + points + text);
	}

	public static void getData(int number, String text, float points) {
		System.out.println(number + text + points);
	}

	public static void getData(String text, int number, float points) {
		System.out.println(text + number + points);
	}

	public static void getData(String text, float points, int number) {
		System.out.println(text + points + number);
	}

	public static void getData(String text, String args, float points, int number) {
		System.out.println(text + args + points + number);
	}

	public static void getData(String text, float points, String args, int number) {
		System.out.println(text + points + args + number);

	}

	public static void getData(String text, float points, int number, String args) {
		System.out.println(text + points + number + args);
	}

}
