package oops.polymorphism.demo1;

public class Main {

	public static void main(String[] args) {
		Employee prithvi = new Employee();
		prithvi.name = "Prithvi Ganesh";

		Manager sindhuja = new Manager();
		sindhuja.name = "Sindhuja R.";

		Clerk varun = new Clerk();
		varun.name = "Varun K Reddy";

		getEmployeeName(prithvi);
		getEmployeeName(sindhuja);
		getEmployeeName(varun);
		
		getManagerName(sindhuja);
		// getManagerName(varun);
		
		getClerkName(varun);
		// getClerkName(sindhuja);
	}

	public static void getEmployeeName(Employee emp) {
		System.out.println(emp.name);
	}

	public static void getManagerName(Manager mgr) {
		System.out.println(mgr.name);
	}

	public static void getClerkName(Clerk ck) {
		System.out.println(ck.name);
	}

}
