package oops.encapsulation.task2;
//create a class named Product
// create 3 attributes namely
// 1. name of type string
// 2. category of type string
// 3. rating of type int
// implement encapsulation and show in the main class
// using 2 objects.

public class Main {

	public static void main(String[] args) {
		Product b=new Product();
		b.setCatagiriy("cookng");
		b.setName("pan");
		b.setRating(5);
		System.out.println("Catagiriy"+" : "+b.getCatagiriy());
		System.out.println("Product"+" : "+b.getName());
		System.out.println("Rating"+" : "+b.getRating());
	}

}
