package com.example.MusicQuiz.service;

import com.example.MusicQuiz.enitty.Music;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class ComparingService {
    private Music guessed;
    private Music actual;
    private List<String> correct ;
    private List<String> unCorrect;

    public ComparingService(Music guessed, Music actual) {
        this.guessed = guessed;
        this.actual = actual;
        this.unCorrect = new ArrayList<>();
        this.correct = new ArrayList<>();
    }

    public int getPoints(){
        int points=0;

        if (guessed.getTitle().equalsIgnoreCase(actual.getTitle())){
            correct.add(guessed.getTitle());
            points++;
        }else{
            unCorrect.add(guessed.getTitle());
        }
        if(guessed.getAuthor().equalsIgnoreCase(actual.getAuthor())){
            points++;
            correct.add(guessed.getAuthor());
        }else{
            unCorrect.add(guessed.getAuthor());
        }
        if(guessed.getAlbum().equalsIgnoreCase(actual.getAlbum())){
            points++;
            correct.add(guessed.getAlbum());
        }
        else{
            unCorrect.add(guessed.getAlbum());
        }
        if(guessed.getMusicGenre().equalsIgnoreCase(actual.getMusicGenre())){
            points++;
            correct.add(guessed.getMusicGenre());
        }else {
            unCorrect.add(guessed.getMusicGenre());
        }
//        if(guessed.getSince()==null){
//            try {
//                throw  new Exception("data nie moze byc nullem");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        if(guessed.getTo()==null){
//            try {
//                throw  new Exception("data nie moze byc nullem");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//       if (actual.getReleaseDate().isAfter(guessed.getSince()) && actual.getReleaseDate().isBefore(guessed.getTo())){
//           points++;
//       }
       return points;
    }

    public List<String> getCorrect() {
        return correct;
    }

    public void setCorrect(List<String> correct) {
        this.correct = correct;
    }

    public List<String> getUnCorrect() {
        return unCorrect;
    }

    public void setUnCorrect(List<String> unCorrect) {
        this.unCorrect = unCorrect;
    }
}
