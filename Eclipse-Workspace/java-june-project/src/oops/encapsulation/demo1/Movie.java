package oops.encapsulation.demo1;

public class Movie {

	private String name;
	private int year;

	// setters // mutators methods
	public void setName(String movieName) {
		this.name = movieName;
	}

	public void setYear(int movieYear) {
		this.year = movieYear;
	}

	// getters // accessors methods
	public String getName() {
		return this.name;
	}

	public int getYear() {
		return this.year;
	}

} // end class{}
