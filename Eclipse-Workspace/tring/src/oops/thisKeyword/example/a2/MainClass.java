package oops.thisKeyword.example.a2;

public class MainClass {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("simba");
		myDog.setAge(5);

		System.out.println(myDog.getName());
		System.out.println(myDog.getAge());
	}

}
