package oops.threads.multithreading.examples.a5;

public class MultithreadExample {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
		}

	}

}
