package oops.lambdas.examples.a1;

public class Main {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		//---------------------------
		myCat.print();
		printThing(myCat);
		
	
		
		
		
//----------------------------------------------------
//		printThing(
//				() ->
//				System.out.println("Meow")
//				);
//	}
//
//	public static void printThing(Printable x) {
//		x.print();
//	}
//--------------------------------------------------
	}public static void printThing(Printable cat) {
		cat.print();
	}

}
