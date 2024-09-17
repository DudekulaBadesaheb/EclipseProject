   package oops.inheritance.Cancept.multiple.demo;

public class Main {

	public static void main(String[] args) {
		Empire empire;
		empire = new Zomato();
		empire.deliverFromEmpire();

		empire = new Swiggy();
		empire.deliverFromEmpire();
		Badesaheb badesaheb;
		badesaheb = new Zomato();
		badesaheb.deliverFromBadesaheb();
		badesaheb = new Swiggy();
		badesaheb.deliverFromBadesaheb();

	}

}
