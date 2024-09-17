package oops.modifiers.access.privateConcept.demo1;

public class Software {

	private String model;
	private double version;

	public static void main(String[] args) {
		Software signal = new Software();
		signal.model = "android";
		signal.version = 12.0;

		System.out.println(signal.model);
		System.out.println(signal.version);
	}
}
