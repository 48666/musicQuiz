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




    public Music() {
    }
}
