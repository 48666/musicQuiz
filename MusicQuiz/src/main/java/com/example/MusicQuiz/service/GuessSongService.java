package com.example.MusicQuiz.service;

import com.example.MusicQuiz.enitty.Music;
import com.example.MusicQuiz.enitty.User;
import com.example.MusicQuiz.enitty.musicgenre.MusicGenre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GuessSongService {
    public static void main(String[] args) {
        System.out.println("niewiem");
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        List<Music> musicList = new ArrayList<>();
        musicList.add(new Music("American Idots","Green Day","Niewiem","Rock", LocalDate.of(200,9,11),"/path"));
              musicList.add(  new Music("Niebieskie swiatko","Maffia gang","nieznam","RAP",LocalDate.of(2018,9,11),"/path2"));

        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("piosenka nr" + (i+1));
            int suma =0;
            System.out.println("podaj tytuł ");
            String title = scanner.nextLine();
            if (title.equals(musicList.get(i).getTitle())){
                suma++;
                System.out.println(true);
            }
            System.out.println("podaj autora");
            String author = scanner.nextLine();
            if (author.equals(musicList.get(i).getAuthor())){
                suma++;
                System.out.println(true);
            }
            System.out.println("podaj album");
            String album = scanner.nextLine();
            if (album.equals(musicList.get(i).getAlbum())){
                suma++;
                System.out.println(true);
            }
            System.out.println("podaj gatunek muzyczny z listy");
            String gatunek = scanner.nextLine();
            if (gatunek.equals(musicList.get(i).getMusicGenre())){
                suma++;
                System.out.println(true);
            }
            System.out.println("podaj przwidywaną date");
            int startData = scanner.nextInt();
            int endData = scanner.nextInt();
            scanner.nextLine();
            if (startData< musicList.get(i).getReleaseDate().getYear() && musicList.get(i).getReleaseDate().getYear() < endData){
                suma++;
                System.out.println(true);
            }
            user.IncreseForEachSong(i,suma);



        }
        HashMap<Integer, Integer> odpowiedzi = user.getForEachSongOrMovie();
        odpowiedzi.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

    }

}
