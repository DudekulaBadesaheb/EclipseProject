package oops.classAndObjects;

public class Main {

	public static void main(String[] args) {
		// Student is class
		// prithvi is object / variable
		Student prithvi = new Student();
		prithvi.name = "Prithvi Ganesh";
		prithvi.age = 22;
		System.out.println(prithvi.name);
		System.out.println(prithvi.age);
		
		Student veera = new Student();
		veera.name = "Veera D.";
		veera.age = 22;
		System.out.println(veera.name);
		System.out.println(veera.age);

	}

}
