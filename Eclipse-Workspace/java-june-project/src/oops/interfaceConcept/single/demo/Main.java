package oops.interfaceConcept.single.demo;

public class Main {

	public static void main(String[] args) {
		Institute teacher;
		
		teacher = new Java();
		teacher.teach();		
		
		teacher = new Python();
		teacher.teach();		
		
		Java jim = new Java();
		jim.teach();
		
		Python john = new Python();
		john.teach();
	}

}
