package oops.generics.genericMethods.examples.a1;

public class GenericMethodExample {

	public static void main(String[] args) {
		shout("java");
		shout(50);
		shout(50.55);
		shout('Z');
		shout(true);
		
		Car car =new Car("white");
		shout(car);
		
		shout(new Car("blue"));
		
		scream("java",50);
		scream(100,100.50);
		scream(true,"python");
		scream(new Car("blue"),'A');
		
		

	}
	
	public static <T> void shout(T thingToShout) {
		System.out.println(thingToShout+"!!!!");
	}
	public static <T,V> void scream(T thingToScream, V otherThingToScream) {
		System.out.println(thingToScream+"!!");
		System.out.println(otherThingToScream+"!!!");
	}

}
