package oops.superKeyword.exmple.a1;

public class Cat extends Animal {
	public String catFoodPreference;
	
public void makeNoise() {
	super.makNoise();
	System.out.println("Meow Meow Meow.");
	
	// super is not requid
	// super.eat();
	eat();
	
//	super.doSomethingPrivate();
}
}
