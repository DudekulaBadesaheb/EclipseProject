package oops.generics.genericClass.task1;

public class Main {

	public static void main(String[] args) {
		Printer<Integer> integerPrinter = new Printer<>(10);
		integerPrinter.print();

		Printer<String> stringPrinter = new Printer<>("KATTAPPA");
		stringPrinter.print();

		Car yellowCar = new Car("YELLOW");
		Printer<Car> carPrinter = new Printer<>(yellowCar);
		carPrinter.print();
	}
}
