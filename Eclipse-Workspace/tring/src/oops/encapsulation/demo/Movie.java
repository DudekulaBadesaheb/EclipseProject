package oops.encapsulation.demo;

public class Movie {
	private String name;
	private int year;
	///setters // mutators methods
	public void setName(String movieName) {
		this.name=movieName;
	}
	public String getName() {
		return this.name;
	}//end 
	public void setYear(int movieYear) {
		this.year=movieYear;
	}
	public int getYear() {
		return this.year;
	}

}
