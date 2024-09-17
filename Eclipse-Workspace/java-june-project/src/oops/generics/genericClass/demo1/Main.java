package oops.generics.genericClass.demo1;

public class Main {

	public static void main(String[] args) {
		IntegerPrinter integerPrinter = new IntegerPrinter(10);
		integerPrinter.print();

		DoublePrinter doublePrinter = new DoublePrinter(10.5);
		doublePrinter.print();

		StringPrinter stringPrinter = new StringPrinter("java");
		stringPrinter.print();

		GenericPrinter<Integer> numberPrinter = new GenericPrinter<>(10);
		numberPrinter.print();

		GenericPrinter<Double> decimalPrinter = new GenericPrinter<>(10.5);
		decimalPrinter.print();

		GenericPrinter<String> textPrinter = new GenericPrinter("python");
		textPrinter.print();

		GenericPrinter<Vehicle> vehiclePrinter = new GenericPrinter("TWO WHEELER");
		vehiclePrinter.print();

	}

}
