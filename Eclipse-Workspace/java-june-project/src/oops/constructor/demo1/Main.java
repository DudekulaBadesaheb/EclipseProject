package oops.constructor.demo1;

public class Main {

	public static void main(String[] args) {
		Student palanisamy;
		palanisamy = new Student("Palanisamy I");		
		System.out.println(palanisamy.name); //
		System.out.println(palanisamy.mobile); //
	
		Student anvith;
		anvith = new Student(98765);
		System.out.println(anvith.name); //
		System.out.println(anvith.mobile); //

		Student saba;
		saba = new Student("Saba Zabeen", 12345);
		System.out.println(saba.name); //
		System.out.println(saba.mobile); //

	}

}
