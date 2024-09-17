package oops.lambdas.usingInterface.examples.a5;

public class Main {

	public static void main(String[] args) {
				
		Printable x = new Printable() {
				public void print() {
					System.out.println("Meow");
				}			
		};
		
	}

	public static void printThing(Printable x) {
		x.print();
	}

}
