package oops.encapsulation.task1;

public class Song {
private String songs;
private String albam;
private int rating;

public String getSongs() {
	return songs;
}
public String getAlbam() {
	return albam;
}
public int getRating() {
	return rating;
}

public void setSongs(String songs) {
	this.songs=songs;
}
public void setAlbam(String albam) {
	this.albam = albam;
}

public void setRating(int rating) {
	this.rating=rating;
}
}
