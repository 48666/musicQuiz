package com.example.MusicQuiz.service;

import com.example.MusicQuiz.enitty.Music;
import com.example.MusicQuiz.enitty.User;
import com.example.MusicQuiz.enitty.musicgenre.MusicGenre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessSongService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        List<Music> musicList = new ArrayList<>();
        musicList.add(new Music("American Idots","Green Day","Niewiem", MusicGenre.ROCK, LocalDate.of(200,9,11),"/path"));

        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("podaj tytuł ");
            String title = scanner.nextLine();
            if (title .equals( musicList.get(i).getTitle())){
                user.increaseScore(i);
            }
            System.out.println("podaj autora");
            String author = scanner.nextLine();
            System.out.println("podaj album");
            String album = scanner.nextLine();
            System.out.println("podaj gatunek muzyczny z listy");
            String gatunek = scanner.nextLine();
            System.out.println("podaj przwidywaną date");
            int data = scanner.nextInt();



        }

    }
}
