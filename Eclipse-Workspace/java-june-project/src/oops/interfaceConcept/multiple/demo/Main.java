package oops.interfaceConcept.multiple.demo;

public class Main {

	public static void main(String[] args) {
		Empire empire;

		empire = new Zomato();
		empire.deliverFromEmpire();

		empire = new Swiggy();
		empire.deliverFromEmpire();

		Meghana meghana;

		meghana = new Zomato();
		meghana.deliverFromMeghana();

		meghana = new Swiggy();
		meghana.deliverFromMeghana();

	}

}
