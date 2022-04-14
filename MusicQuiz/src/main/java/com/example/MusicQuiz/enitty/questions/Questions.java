package com.example.MusicQuiz.enitty.questions;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    private List<String> questions = new ArrayList<>();

    public Questions() {
        this.questions =  new ArrayList<>();
        questions.add("tytuł piosenki?");
        questions.add("autor piosenki?");
        questions.add("album?");
        questions.add("Gatunek muzyki?");
        questions.add("Rok wydania piosenki od, do?");
    }

    public List<String> getQuestions() {

        return questions;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questions=" + questions +
                '}';
    }

}
