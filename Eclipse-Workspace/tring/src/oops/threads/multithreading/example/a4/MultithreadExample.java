package oops.threads.multithreading.example.a4;

public class MultithreadExample {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing1 = new MultithreadThing(i);
			Thread myThread = new Thread(myThing1);
			myThread.start();
		}

		
	}

}
