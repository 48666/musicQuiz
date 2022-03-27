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
    private String login;

   private HashMap<Integer,Integer> forEachSongOrMovie;
   private int pointsForQuest;
   private final int  addForMax =3;




    public User() {
        this.forEachSongOrMovie = new HashMap<>();
        setToZero();

    }

    public void setToZero(){
        for (Map.Entry<Integer, Integer> entry : forEachSongOrMovie.entrySet()) {
          forEachSongOrMovie.put(0,0);
        }
    }
    public void IncreseForEachSong(int index,int suma){
       forEachSongOrMovie.put(index,suma);
    }
    public void countPunktacja(){
      this.pointsForQuest =forEachSongOrMovie.entrySet().stream().mapToInt(e ->e.getValue()).sum();
    }
    public void AddIfMax(){
        long count = forEachSongOrMovie.entrySet().stream().filter(e -> e.getValue() == 5).count();
        pointsForQuest += addForMax* count;

    }

}
