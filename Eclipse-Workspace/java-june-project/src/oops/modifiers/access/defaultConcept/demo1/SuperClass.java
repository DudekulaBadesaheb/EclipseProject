package oops.modifiers.access.defaultConcept.demo1;

public class SuperClass {

	// access modifier is default
	void print() {
		System.out.println("Hello BRO !!!");
	}

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		superClass.print();
	}

}
