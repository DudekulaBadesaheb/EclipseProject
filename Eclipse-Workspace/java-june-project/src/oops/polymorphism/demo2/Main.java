package oops.polymorphism.demo2;

public class Main {

	public static void main(String[] args) {
		Butterscotch bs = new Butterscotch();

		Pista pi = new Pista();

		getIcecream(bs);
		getIcecream(pi);
	}

	public static void getIcecream(Icecream ice) {
		ice.flavour();
	}

}
