package oops.modifiers.access.publicConcept.demo1;

// POJO Class
public class Farmer {
	public String villageName;
	public int cows;

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.villageName = "Acharanarasapur";
		farmer.cows = 3;

		System.out.println(farmer.villageName);
		System.out.println(farmer.cows);
	}
}
