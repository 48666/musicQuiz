package com.example.MusicQuiz.enitty.musicgenre;

public enum MusicGenre {
    ROCK(1),POP(2),RAP(3),REGGE(4);
    private int index;
    private String name;

    MusicGenre(String name) {
        this.name = name;
    }

    MusicGenre(int index) {
        this.index = index;
    }

}
