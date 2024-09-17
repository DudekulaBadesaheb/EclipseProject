package oops.encapsulation.task1;

import oops.encapsulation.EncapsulationTheory;

public class Main {

	public static void main(String[] args) {
		// create a class named Song
		// create 3 attributes namely
		// 1. name of type string
		// 2. album of type string
		// 3. rating of type int
		// implement encapsulation and show in the main class
		// using 2 objects.
		Song b=new Song();
		b.setAlbam("natunatu");
		b.setSongs("natu natu");
		b.setRating(5);
		System.out.println(b.getAlbam());
		System.out.println(b.getSongs());
		System.out.println(b.getRating());
		System.out.println(b.getClass());

	}

}
