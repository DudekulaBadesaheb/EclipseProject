package oops.Polymorohism.demo2;

public class Main {

	public static void main(String[] args) {
		Butterscotch bs=new Butterscotch();
		Pista pi =new Pista();
		getIcecream(pi);

		getIcecream(bs);
	}
public static void getIcecream(Icecream ice) {
	ice.flavour();
	
}
}
