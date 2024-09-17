package oops.encapsulation.task1;

// create a class name Song
// create 3 attributes namely
//1. name of type string
//2. album of type String
//3. rating of type int
// implement encapsulation and show in the main class
// using 2 objects
public class Main {

	public static void main(String[] args) {
		Song song = new Song();
		song.setName("RRR");
		song.setAlbum("natonato");
		song.setRating(5);

		System.out.println(song.getName());
		System.out.println(song.getAlbum());
		System.out.println(song.getRating());

	}

}
