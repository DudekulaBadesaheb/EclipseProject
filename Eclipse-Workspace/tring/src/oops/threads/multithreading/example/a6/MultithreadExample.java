package oops.threads.multithreading.example.a6;

public class MultithreadExample {

	public static void main(String[] args) throws Exception {

		for (int i = 1; i < 6; i++) {
			MultithreadThing myThing1 = new MultithreadThing(i);
			Thread myThread = new Thread(myThing1);
			
			
			myThread.start();
			// Tests if this thread is alive.
			// A thread is alive if it has been started and has not yet died.
			// Returns true if this thread is alive, false otherwise.
			boolean isTrueOrFalse;
			isTrueOrFalse = myThread.isAlive();
			// getName()
			// returns this thread's name
			
			if(isTrueOrFalse == true) {
				System.out.println(myThread.getName()+": is alive");
				
			}else {
				System.out.println(myThread.getName()+": is dead");
				
			}
			
			
			// join()
			// Waits for this thread to die
			myThread.join();
			
			isTrueOrFalse =myThread.isAlive();
			if(isTrueOrFalse == true) {
				System.out.println(myThread.getName()+": is alive");
				
			}else {
				System.out.println(myThread.getName()+": is dead");
				
			}
		}

		
	}

}
