package oops.innerClass.examples.a1;

// non static InnerClass
public class OuterClass {
	public int number = 6;

	public void heyThere() {
		System.out.println("Hey there!");

	}

	public class InnerClass {
		public int innerNumber = 10;

		public void whatsup() {
			System.out.println("what's up from the Inner Class");
		}
		
		}

	} // end inner class

} // end outer class
