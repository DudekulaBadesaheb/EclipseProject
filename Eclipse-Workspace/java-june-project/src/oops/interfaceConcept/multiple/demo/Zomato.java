package oops.interfaceConcept.multiple.demo;

public class Zomato implements Empire, Meghana {

	@Override
	public void deliverFromEmpire() {
		System.out.println("Food delivered from Empire by Zomato");
	}

	@Override
	public void deliverFromMeghana() {
		System.out.println("Food delivred from Meghana by Zomato");
	}

}
