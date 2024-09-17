package oops.modifiers.access.protecterConceptDemo1A;

import oops.modifiers.access.protecterConceptDemo1.Farmer;

public class FarmarMain {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.villagename = "kundapur";
		farmer.cows = 5;
		System.out.println(farmer.villagename);
		System.out.println(farmer.cows);
		
		Farmer farmer2 = new Farmer();
		farmer2.villagename = "";
		farmer2.cows = 3;
		System.out.println(farmer2.villagename);
		System.out.println(farmer2.cows);
	}
}
