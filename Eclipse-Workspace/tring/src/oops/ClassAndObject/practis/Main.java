
package oops.ClassAndObject.practis;

/*
 * create customer class with 3 instance variables namely
 * 1. name of type string
 * mobileNumber of type long
 * city of type string
 * 
 * create 2 object and populate values
 * and print them in cosole
 */
public class Main {

	public static void main(String[] args) {
		//
		Custemar bade = new Custemar();

		bade.name = "badesaheb";
		bade.mobileNumber = 6305465911L;
		bade.city = "Mulugundam";
		System.out.println(bade.name);
		System.out.println(bade.mobileNumber);
		System.out.println(bade.city);

		bade.name = "mani";
		bade.mobileNumber = 7997739198l;
		bade.city = "adoni";
		System.out.println(bade.name);
		System.out.println(bade.mobileNumber);
		System.out.println(bade.city);

	}

}
