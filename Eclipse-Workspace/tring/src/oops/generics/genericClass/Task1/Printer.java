package oops.generics.genericClass.Task1;

public class Printer<T> {
	
		public T thisToPrint;
		public Printer(T thingToPrint) {
			this.thisToPrint=thingToPrint;
		}
		public void print() {
			System.out.println(this.thisToPrint);
		}
}
