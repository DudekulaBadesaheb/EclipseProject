package oops.encapsulation.demo1;

public class Main {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		movie1.setName("kgf");
		movie1.setYear(2021);
		System.out.println(movie1.getName());
		System.out.println(movie1.getYear());
	}
}
