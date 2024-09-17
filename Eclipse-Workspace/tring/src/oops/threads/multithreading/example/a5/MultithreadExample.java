package oops.threads.multithreading.example.a5;

public class MultithreadExample {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing1 = new MultithreadThing(i);
			myThing1.start();
		}

		throw new RuntimeException();

	}

}
