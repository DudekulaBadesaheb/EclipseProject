package oops.threads.multithreading.examples.a3;

public class MultithreadExample {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			myThing.start();
		}

	}

}
