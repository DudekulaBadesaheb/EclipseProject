package oops.threads.multithreading.example.a4;

public class MultithreadThing implements Runnable {
	private int threadNumber;

	public MultithreadThing(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(i + " from Thread: " + threadNumber);

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
