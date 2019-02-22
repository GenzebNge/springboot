package springboot202.springboot;

import javax.persistence.*;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany
    private Song SongName;

    public Album() {
    }

    public Album(String name, Song songName) {
        this.name = name;
        SongName = songName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song getSongName() {
        return SongName;
    }

    public void setSongName(Song songName) {
        SongName = songName;
    }
}
