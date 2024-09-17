package oops.modifiers.access.publicConcept.demo1;

public class Main {

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.villageName = "Agraharam";
		farmer.cows = 2;

		System.out.println(farmer.villageName);
		System.out.println(farmer.cows);

	}

}
