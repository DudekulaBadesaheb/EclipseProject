package oops.interfaceConcept.demo.single;

public class Main {

	public static void main(String[] args) {
		Institute student;
		student = new Java();
		student.teach();

		student = new Pythone();
		student.teach();

		Java bade = new Java();
		bade.teach();
		Pythone dasta = new Pythone();
		dasta.teach();

	}

}
