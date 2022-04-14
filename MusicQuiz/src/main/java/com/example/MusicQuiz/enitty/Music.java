package com.example.MusicQuiz.enitty;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long musicId;
    private String title;
    private String author;
    private String album;
    private String musicGenre;
    private LocalDate releaseDate;
    private String mp3Paht;
    private LocalDate since;
    private LocalDate to;
    private String photoPath;


    public Music(String title, String author, String album, String musicGenre, LocalDate releaseDate, String mp3Paht) {
        this.title = title;
        this.author = author;
        this.album = album;
        this.musicGenre = musicGenre;
        this.releaseDate = releaseDate;
        this.mp3Paht = mp3Paht;
    }

    public Music(Long musicId, String title, String author, String album, String musicGenre, LocalDate releaseDate, String mp3Paht, LocalDate since, LocalDate to, String photoPath) {
        this.musicId = musicId;
        this.title = title;
        this.author = author;
        this.album = album;
        this.musicGenre = musicGenre;
        this.releaseDate = releaseDate;
        this.mp3Paht = mp3Paht;
        this.since = since;
        this.to = to;
        this.photoPath = photoPath;
    }

    public Music() {
    }

    public Long getMusicId() {
        return musicId;
    }

    public void setMusicId(Long musicId) {
        this.musicId = musicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMp3Paht() {
        return mp3Paht;
    }

    public void setMp3Paht(String mp3Paht) {
        this.mp3Paht = mp3Paht;
    }

    public LocalDate getSince() {
        return since;
    }

    public void setSince(LocalDate from) {
        this.since = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicId=" + musicId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", album='" + album + '\'' +
                ", musicGenre=" + musicGenre +
                ", releaseDate=" + releaseDate +
                ", mp3Paht='" + mp3Paht + '\'' +
                ", from=" + since +
                ", to=" + to +
                '}';
    }
}
