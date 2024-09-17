package oops.constructor.task1;

public class Main {

	public static void main(String[] args) {
		// create class employee
		// 2 instance variable
		// string name
		// string city
		// all the possible constructor
		// create object using all the constructor in main class
		// execute and show
		Employee persan = new Employee("bade");
		System.out.println(persan.name);
		Employee student = new Employee("badesaheb", "mulugunam");
		System.out.println(student.name);
		System.out.println(student.city);
		Employee employee=new Employee("dastagiri","adoni",100000);
		System.out.println("Employee Nmae: "+ employee.name+" Employee City: "+employee.city+" Employee Salary: "+employee.Salary);
		
	}

}
