package oops.encapsulation.task1;

public class Song {
	public String name;
	public String album;
	public int rating;

	public void setName(String songName) {
		this.name = songName;

	}

	public String getName() {
		return this.name;
	}

	public void setAlbum(String songalbum) {
		this.album = songalbum;
	}

	public String getAlbum() {
		return this.album;
	}

	public void setRating(int songrating) {
		this.rating = songrating;
	}
	public int getRating() {
		return this.rating;
	}
}
