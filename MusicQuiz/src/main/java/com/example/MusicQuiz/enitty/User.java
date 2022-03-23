package com.example.MusicQuiz.enitty;

import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
public class User {
    private String email;
    private String name;
    private String lastName;
    private int age;
    private int SumForEachSong;
   private HashMap<Integer,Music> forEachSongOrMovie;
   private int pointsForQuest;



    public User() {
setToZero();
    }

    public void setToZero(){
        for (Map.Entry<Integer, Music> entry : forEachSongOrMovie.entrySet()) {
          forEachSongOrMovie.put(0,null);
        }
    }
    public void IncreseForEachSong(int index){
        for (Map.Entry<Integer, Music> entry : forEachSongOrMovie.entrySet()) {
            forEachSongOrMovie.put()
        }
    }

}
