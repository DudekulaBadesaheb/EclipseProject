package oops.generics.genericClass.task1;

public class Printer<T> {

	private T anything;

	public Printer(T anything) {
		this.anything = anything;
	}

	public void print() {
		System.out.println(anything);
	}

}
