package oops.threads.example;

public class CountDownUsingThreadExample {

	public static void main(String[] args) throws Exception{
		countDown(10);
	}

	public static void countDown(int x) throws Exception {
		for (int i = x; i > -1; i--) {
			System.out.println("i:" + i);
			Thread.sleep(1000);
		}
	}

}
