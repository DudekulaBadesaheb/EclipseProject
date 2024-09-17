package oops.constructor.demo1;

// POJO Class

public class Student {
	public String name;
	public int mobile;

	// default constructor
	public Student() {
		System.out.println("Default Constructor is working");
	}

	// constructor with parameter name
	public Student(String studentName) {
		this.name = studentName;
	}

	// constructor with parameter mobile
	public Student(int studentMobile) {
		this.mobile = studentMobile;
	}

	// constructor with parameter name, mobile
	public Student(String studentName, int studentMobile) {
		this.name = studentName;
		this.mobile = studentMobile;
	}

}
