package oops.modifiers.access.defaultConcept.demo1A;

import oops.modifiers.access.defaultConcept.demo1.SuperClass;

public class SubClass extends SuperClass {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		
		// default - sub class cannot access in different package 
		// subClass.print();
	}
}
