package oops.generics.genericClass.demo1;

public class StringPrinter {

	public String thingToPrint;

	public StringPrinter(String thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(this.thingToPrint);
	}

}
