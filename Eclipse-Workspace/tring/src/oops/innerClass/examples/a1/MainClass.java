package oops.innerClass.examples.a1;

import oops.innerClass.examples.a1.OuterClass.InnerClass.bade;
import oops.innerClass.examples.a2.OuterClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.heyThere();

		// InnerClass inner = new InnerClass();

		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.whatsup();
		


	}

}
