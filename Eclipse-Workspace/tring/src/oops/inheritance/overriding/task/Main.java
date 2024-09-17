package oops.inheritance.overriding.task;

public class Main {

	public static void main(String[] args) {
		Restaurant biryani;
		biryani = new BiryaniChef();
		biryani.foodQulity();
		biryani.foodTest();

		Restaurant palakPaneer;
		palakPaneer = new PalakPaneerChfe();
		palakPaneer.foodQulity();
		palakPaneer.foodTest();
	}

}
