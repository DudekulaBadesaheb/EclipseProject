package oops.generics.genericClass.demo1;

public class GenericPrinter<T> {

	private T thingToPrint;

	public GenericPrinter(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(this.thingToPrint);
	}

}
