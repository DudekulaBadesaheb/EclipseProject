package abstraction;

public class Main {

	public static void main(String[] args) {
		Restarent food;
		food = new dosa();
		System.out.println("dosa :");
		food.rating();
		food.tast();
		food = new Briyani();
		System.out.println("Biriyani :");
		food.rating();
		food.tast();

	}

}
