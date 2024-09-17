package oops.abstraction.demo;

public class Main {

	public static void main(String[] args) {
		Zomato customer;
		
		customer = new PayTM();
		customer.payment();

		customer = new GooglePay();
		customer.payment();
	}

}
