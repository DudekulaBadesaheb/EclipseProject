package oops.generics.genericClass.demo1;

public class DoublePrinter {

	public Double thingToPrint;

	public DoublePrinter(Double thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(this.thingToPrint);
	}

}
