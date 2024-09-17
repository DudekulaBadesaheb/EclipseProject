package oops.threads.multithreading.example.a2;

public class MultithreadThing extends Thread {
	private int threadNumber;

	public MultithreadThing(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(i + " from Thead: " + threadNumber);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
