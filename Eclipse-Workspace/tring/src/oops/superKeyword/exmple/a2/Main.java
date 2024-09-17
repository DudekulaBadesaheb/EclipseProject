package oops.superKeyword.exmple.a2;

public class Main {

	public static void main(String[] args) {
		Cat myCat = new Cat(2,"Lisa","Meow food");
		System.out.println(myCat.age+" "+myCat.name+" "+myCat.catFoodPreference);
		System.out.println(myCat.name);
		System.out.println(myCat.catFoodPreference);
		myCat.makeNoise();
		myCat.eat();
		myCat.jump();
	}

}
