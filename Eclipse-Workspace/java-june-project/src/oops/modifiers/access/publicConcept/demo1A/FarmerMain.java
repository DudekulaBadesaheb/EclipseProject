package oops.modifiers.access.publicConcept.demo1A;

import oops.modifiers.access.publicConcept.demo1.Farmer;

public class FarmerMain {

	public static void main(String[] args) {

		Farmer farmer = new Farmer();
		farmer.villageName = "Kundapur";
		farmer.cows = 5;

		System.out.println(farmer.villageName);
		System.out.println(farmer.cows);

		FarmerChild farmerChild = new FarmerChild();
		farmerChild.villageName = "Molagavalli";
		farmerChild.cows = 3;

		System.out.println(farmerChild.villageName);
		System.out.println(farmerChild.cows);

	}

}
