package oops.objectClass.task;

public class Order {
	public int id;
	public Customer customer;
	public int amount;

	public String toString() {
		String data = "order:" + id + "," + customer + "," + amount;
		return data;
	}
}
