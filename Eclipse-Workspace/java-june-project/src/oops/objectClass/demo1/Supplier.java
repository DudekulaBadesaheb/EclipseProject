package oops.objectClass.demo1;

// POJO Class
public class Supplier {

	public String name;
	public int code;

	@Override
	public String toString() {
		String data = "Supplier: " + this.name + ", " + this.code;
		return data;
	}

}
