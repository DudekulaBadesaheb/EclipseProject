package oops.generics.genericClass;

public class Main {

	public static void main(String[] args) {
		IntegerPrinter integerPrinter = new IntegerPrinter(10);
		integerPrinter.print();
		
		DoublePrinter doublePrint = new DoublePrinter(10.5);
			doublePrint.print();
		
		StringPrinter stringPrint = new StringPrinter("java") ;
			stringPrint.print();
		
		GenericPrinter<Integer> numberPrinter = new GenericPrinter<>(10);
		numberPrinter.print();
		GenericPrinter<Double> doublePrinter = new GenericPrinter<>(10.6);
		doublePrinter.print();
		GenericPrinter<String> StringPrinter1 = new GenericPrinter<>("hello");
		StringPrinter1.print();
		GenericPrinter<Vechil> VechilPrinter = new GenericPrinter("badesheb");
		VechilPrinter.print();
		
		

	}

}
