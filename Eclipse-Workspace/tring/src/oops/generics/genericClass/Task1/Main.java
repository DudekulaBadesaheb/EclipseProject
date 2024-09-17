package oops.generics.genericClass.Task1;

public class Main {

	public static void main(String[] args) {
		Printer<Integer> integerPrint = new Printer<Integer>(200);
		integerPrint.print();
		Printer<String> StringPrinter = new Printer<String>("hello");
		StringPrinter.print();
		Car white =new Car("white");
		Printer<Car> car = new Printer <>(white);
		car.print();

	}

}
