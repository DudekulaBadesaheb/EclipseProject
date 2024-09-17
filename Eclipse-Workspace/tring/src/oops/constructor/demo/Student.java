package oops.constructor.demo;

public class Student {
	public String name;
	public int mobile;
	
	//default constructor
		public Student() {
			System.out.println("default canstructor is working");
		}
	// constructor with parameter name

	public Student(String name) {
		this.name = "palanisomy";
	}
	// constructor with parameter mobile
	public Student(int mobile) {
		this.mobile = 100;
	}
	// constructor with parameter name,mobile
	public Student(String studentName, int studentMobile) {
		this.name = studentName;
		this.mobile = studentMobile;
	}
	

}
