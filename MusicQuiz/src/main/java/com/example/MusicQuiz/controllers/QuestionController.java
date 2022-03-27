package com.example.MusicQuiz.controllers;

import com.example.MusicQuiz.enitty.Music;
import com.example.MusicQuiz.enitty.musicgenre.AudioFilePlayer;
import com.example.MusicQuiz.enitty.questions.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class QuestionController {

   private Questions questions = new Questions();


    @GetMapping("/mquiz")
    public String questiooController(Model model){
        List<String> questions = this.questions.getQuestions();
        model.addAttribute("listquest",questions);

        return "mquiz";
    }
    @GetMapping("/mquizquest")
    public String createProjectForm(Model model) {

        model.addAttribute("music", new Music());
        return "mquiz";
    }
    @PostMapping("/save-project")
    public String saveProjectSubmission(@ModelAttribute Music music) {

        // TODO: save project in DB here

        return "mquiz";
    }
    @GetMapping("/play")
    public String playSount() {
        final AudioFilePlayer player = new AudioFilePlayer();
        player.play("src/main/java/com/example/MusicQuiz/muzyka/florida.mp3");
        System.out.println("niewiem");
        return "mquiz";
    }
}
