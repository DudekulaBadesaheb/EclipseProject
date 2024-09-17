package oops.innerClass.examples.a2;

import oops.innerClass.examples.a2.OuterClass.InnerClass;

public class MainClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.heyThere();

		// InnerClass inner = new InnerClass();

		OuterClass.InnerClass inner= new OuterClass.InnerClass() {
		
		}

	}

}
