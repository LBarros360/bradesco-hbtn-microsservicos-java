package com.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private List<Song> list = new ArrayList<>();

    public SongRepository() {
        this.list.add(new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975"));
        this.list.add(new Song(2, "Imagine", "John Lennon", "Imagine", "1971"));
    }

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        // TODO
        return null;
    }

    public void addSong(Song s) {
        // TODO
    }

    public void updateSong(Song s) {
        // TODO
    }

    public void removeSong(Song s) {
        // TODO
    }
}
