package oops.threads.multithreading.examples.a6;

public class MultithreadExample {

	public static void main(String[] args) throws Exception {

		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();

			// isAlive()
			// Tests if this thread is alive.
			// A thread is alive if it has been started and has not yet died.
			// Returns true if this thread is alive, otherwise false
			boolean isTrueOrFalse;
			isTrueOrFalse = myThread.isAlive();
			// getName()
			// Returns this thread's name.

			if (isTrueOrFalse == true) {
				System.out.println(myThread.getName() + " : is alive");
			} else {
				System.out.println(myThread.getName() + " : is dead");
			}

			// join()
			// Waits for this thread to die.
			myThread.join();

			isTrueOrFalse = myThread.isAlive();
			if (isTrueOrFalse == true) {
				System.out.println(myThread.getName() + " : is alive");
			} else {
				System.out.println(myThread.getName() + " : is dead");
			}
		}

	}

}
