package oops.generics.genericClass.demo1;

public class IntegerPrinter {

	public Integer thingToPrint;

	public IntegerPrinter(Integer thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(this.thingToPrint);
	}

}
