package springboot202.springboot;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String artist;
    private int rating;
    private int year;
    @ManyToOne
    private Album albumName;

    public Song() {
    }

    public Song(String name, String artist, int rating, int year, Album albumName) {
        this.artist = artist;
        this.rating = rating;
        this.year = year;
        this.albumName = albumName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Album getAlbumName() {
        return albumName;
    }

    public void setAlbumName(Album albumName) {
        this.albumName = albumName;
    }
}
