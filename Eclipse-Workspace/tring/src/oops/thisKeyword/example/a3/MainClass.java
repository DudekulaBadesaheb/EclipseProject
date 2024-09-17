package oops.thisKeyword.example.a3;

public class MainClass {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		
		System.out.println(myDog.getName());
		System.out.println(myDog.getAge());
		
		Dog hisDog = new Dog("Stella");
		System.out.println(hisDog.getName());
		System.out.println(hisDog.getAge());
		
		Dog Dog = new Dog("jolly",3);
		System.out.println(Dog.getName());
		System.out.println(Dog.getAge());
		
		
	}

}
