package com.example.MusicQuiz.controllers;

import com.example.MusicQuiz.MusicRepository;
import com.example.MusicQuiz.enitty.Music;
import com.example.MusicQuiz.enitty.musicgenre.AudioFilePlayer;
import com.example.MusicQuiz.enitty.questions.Questions;
import com.example.MusicQuiz.service.ComparingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;
import java.util.Random;

@Controller
public class QuestionController {

    private ComparingService comparingService;
    private Music currentMusic = new Music();

    public void setCurrentMusic(Music currentMusic) {
        this.currentMusic = currentMusic;
    }

    public Music getCurrentMusic() {
        return currentMusic;
    }

    @Autowired
    private MusicRepository musicRepository;

   private Questions questions = new Questions();



    @GetMapping("/mquizquest")
    public String createProjectForm(Model model) {
        Random random = new Random();
        List<Music> musicList = musicRepository.findAll();
        Music music = musicList.get(random.nextInt(musicList.size()));
        setCurrentMusic(music);

        model.addAttribute("questions", new Music());
        return "mquiz";
    }
    @PostMapping("/mquizquest")
    public String saveProjectSubmission(@ModelAttribute Music music, Model model) {
        ComparingService cp = new ComparingService(music,currentMusic);
        int points = cp.getPoints();
        List<String> correct = cp.getCorrect();
        List<String> unCorrect = cp.getUnCorrect();

        // dodanie do atrybutu poprawnych odpowiedzi
        model.addAttribute("good",correct);

        // dodanie do atrybutu nie poprawnych odpowiedzi
        model.addAttribute("bad",unCorrect);

        model.addAttribute("music",music);
        model.addAttribute("points",String.valueOf(points));

        System.out.printf("puntky za runde" + points);



        return "sucess";
    }
    @GetMapping("/play")
    public String playSount() {


        final AudioFilePlayer player = new AudioFilePlayer();
        //src/main/java/com/example/MusicQuiz/muzyka/hellacdc.mp3
        player.play(currentMusic.getMp3Paht());

        return "mquiz";
    }

}
