package oops.interfaceConcept.multiple.demo;

public class Swiggy implements Empire, Meghana {

	@Override
	public void deliverFromMeghana() {
		System.out.println("Food delivered from Meghana by Swiggy ");
	}

	@Override
	public void deliverFromEmpire() {
		System.out.println("Food delivered from Empire by Swiggy");
	}

}
