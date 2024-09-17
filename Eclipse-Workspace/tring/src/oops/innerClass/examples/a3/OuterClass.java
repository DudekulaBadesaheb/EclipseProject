package oops.innerClass.examples.a3;

// non static InnerClass
public class OuterClass {
	public int number = 6;

	public void heyThere() {
		System.out.println("Hey there!");
		
		class LocalInnerClass{
			String localInnerText ="Here's Kattappa";
			
			void printLocaInnerText() {
				System.out.println(localInnerText);
				
			}
		}// end local inner class
		LocalInnerClass lic = new LocalInnerClass();
		lic.printLocaInnerText();

	}// end hey there method



} // end outer class
