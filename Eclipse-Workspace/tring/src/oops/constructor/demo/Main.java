package oops.constructor.demo;

public class Main {

	public static void main(String[] args) {
		Student palanisamy;
		palanisamy = new Student("Palanisamy I");
		System.out.println(palanisamy.name);
		System.out.println(palanisamy.mobile);

		Student saba;
		saba = new Student(566525);
		System.out.println(saba.mobile);
		System.out.println(saba.name);

		Student bade;
		bade = new Student("badesaheb");
		System.out.println(bade.name);
		System.out.println(bade.mobile);
	}

}
