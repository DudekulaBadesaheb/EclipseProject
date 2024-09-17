package oops.abstraction.demo;

public abstract class Main {

	public static void main(String[] args) {
	Zomato castomar;
	castomar  = new PayTm();
	castomar.payment();
	
	castomar = new Google();
	castomar.payment();
	}

}
