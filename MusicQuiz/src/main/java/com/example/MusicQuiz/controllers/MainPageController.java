package com.example.MusicQuiz.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainPageController {
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("start");
        return mv;
    }
}
