package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping("/welcome")
    public String mensagemBoasVindas() {
        return "Bem-vindo ao serviço de músicas!";
    }

    @GetMapping(path = "/allSongs")
    public List<Song> getAllSongs() {
        return null;
    }

    @GetMapping(path = "/findSong/{id}")
    public Song findSongById(@PathVariable Integer id) {
        return null;
    }

    @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
    public Song addSong(@RequestBody Song song) {
        return null;
    }

    @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
    public Song updadeSong(@RequestBody Song song) {
        return null;
    }

    @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
    public void deleteSongById(@RequestBody Song song) {
        // TODO
    }
}
