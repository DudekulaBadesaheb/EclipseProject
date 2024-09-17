package oops.superKeyword.exmple.a2;

public class Cat extends Animal {
	public String catFoodPreference;

	public Cat(int age, String name, String catFoodPreference) {
		super(age, name);
//		this.age=age;
//		this.name=name;
		this.catFoodPreference = catFoodPreference;
	}

	public void makeNoise() {
		super.makNoise();
		System.out.println("Meow Meow Meow.");

		// super is not requid
		// super.eat();
		eat();

//	super.doSomethingPrivate();
	}
	public void jump() {
		
		System.out.println(super.name);
		super.makNoise();
	}
}
