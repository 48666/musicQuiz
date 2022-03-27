package com.example.MusicQuiz.enitty;

import com.example.MusicQuiz.enitty.musicgenre.MusicGenre;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
@AllArgsConstructor
@Data
public class Music {
private String title;
private String author;
private String album;
private MusicGenre musicGenre;
private LocalDate releaseDate;
private String mp3Paht;
private LocalDate from ;
private LocalDate to;

    public Music(String title, String author, String album, MusicGenre musicGenre, LocalDate releaseDate, String mp3Paht) {
        this.title = title;
        this.author = author;
        this.album = album;
        this.musicGenre = musicGenre;
        this.releaseDate = releaseDate;
        this.mp3Paht = mp3Paht;
    }

    public Music() {
    }
}
