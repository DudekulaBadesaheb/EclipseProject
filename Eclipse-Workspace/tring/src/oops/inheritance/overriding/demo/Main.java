package oops.inheritance.overriding.demo;

public class Main {

	public static void main(String[] args) {
		Animal dog;
		dog =new Dog();
		dog.eat();
		dog.makesSound();
		
		
		Animal cat;
		cat=new Cat();
		cat.eat();
		cat.makesSound();

	}

}
