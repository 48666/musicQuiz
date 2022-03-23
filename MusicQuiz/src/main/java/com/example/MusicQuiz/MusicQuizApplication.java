package com.example.MusicQuiz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MusicQuizApplication {


	public static void main(String[] args) {

		SpringApplication.run(MusicQuizApplication.class, args);
		System.out.println("start Aplikacji");

		String audioPath = "/home/user1/Documents/java/spring/MusicQuiz (1)/MusicQuiz/src/main/java/com/example/MusicQuiz/muzyka/nb.mp3";

	}

}
