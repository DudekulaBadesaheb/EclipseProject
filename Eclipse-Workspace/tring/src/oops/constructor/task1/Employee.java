package oops.constructor.task1;

public class Employee {
	public String name;
	public String city;
	public int Salary;

	public Employee() {
		System.out.println("workinhg plases difarent");
	}

	public Employee(String employeeName) {
		this.name = employeeName;

	}

	public Employee(String employeeName, String employeeCity) {
		this.name = employeeName;
		this.city = employeeCity;

	}

	public Employee(int employeeSalary) {
		this.Salary = employeeSalary;
	}
	
	public Employee(String employeeName,String employeeCity,int employeeSalary ) {
		this.name=employeeName;
		this.city=employeeCity;
		this.Salary=employeeSalary;
	}
	

}
