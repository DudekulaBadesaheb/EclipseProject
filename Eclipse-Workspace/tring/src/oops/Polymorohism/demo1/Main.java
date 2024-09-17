package oops.Polymorohism.demo1;



public class Main {

	public static void main(String[] args) {
		Employee prithvi = new Employee();
		prithvi.name="Prithvi Ganesh";
		
		Manager sindhuja = new Manager();
		sindhuja.name="sindhuja r.";
		
		Clerk varun = new Clerk();
		varun.name = "Varun k reddy";
		getEmployeeName(prithvi);
		getEmployeeName(sindhuja);
		getEmployeeName(varun);
		getManagerName(sindhuja);
		getClerk(varun);
		
		

	}
private static void getManagerName(Manager sindhuja) {
		// TODO Auto-generated method stub
		
	}
private static void getClerk(Clerk varun) {
		// TODO Auto-generated method stub
		
	}
public static void getEmployeeName(Employee employee) {
	System.out.println(employee.name);
	
}


}
