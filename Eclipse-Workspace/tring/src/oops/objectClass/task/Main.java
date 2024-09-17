package oops.objectClass.task;

public class Main {

	public static void main(String[] args) {
		// create 2 pojo class customer and order
		// in custome 2 variables namely
		// 1. name of type String
		// 2. city of type String
		// in order class create 2 instance variable namely
		// 1. id of type int
		// 2. customer of type Custormer
		// 3. amount of type int
		// in main class create object of customer and order
		// and show the implementation
		// override toString in each pojo clazss
		Customer customer = new Customer();
		customer.name = "Badesaheb";
		customer.city = "adoni";
		
		Order order = new Order();
		order.id = 1;
		order.customer = customer;
		
		order.amount = 10000;
		System.out.println(order);
	}

}
