package oops.threads.multithreading.example.a3;

public class MultithreadThing extends Thread{
	private int threadNumber;
	
	public MultithreadThing(int threadNumber) {
		this.threadNumber =threadNumber;
	}
	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(i+"from Thred:"+threadNumber);
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
