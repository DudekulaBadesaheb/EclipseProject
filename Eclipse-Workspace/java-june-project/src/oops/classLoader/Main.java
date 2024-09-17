package oops.classLoader;

public class Main {

	public static void main(String[] args) throws Exception {
		// Both static block and instance block will be executed
		SunShine sunShine;
		sunShine = new SunShine();

		// only static block will be executed
		Class.forName("oops.classLoader.SunShine");
	}
}
