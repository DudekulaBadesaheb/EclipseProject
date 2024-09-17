package oops.generics.genericClass;

public class GenericPrinter<T> {
public T thisToPrint;
public GenericPrinter(T thingToPrint) {
	this.thisToPrint=thingToPrint;
}
public void print() {
	System.out.println(this.thisToPrint);
}
}
