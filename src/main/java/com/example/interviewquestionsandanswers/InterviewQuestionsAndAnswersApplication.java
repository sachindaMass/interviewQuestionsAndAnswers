package com.example.interviewquestionsandanswers;

import com.example.interviewquestionsandanswers.abstractVsInterface.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewQuestionsAndAnswersApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewQuestionsAndAnswersApplication.class, args);
        Wrestler wrestler1 = new Kane();
        Wrestler wrestler2 = new StoneCold();

        wrestler1.themeMusic();
        wrestler1.finisher();
        wrestler1.paymentForWork(5);

        wrestler2.themeMusic();
        wrestler2.finisher();
        wrestler2.paymentForWork(3);

        WrestlerInterface wrestlerInterface = new StoneColdInter();

        wrestlerInterface.themeMusic();
        wrestlerInterface.finisher();
        wrestlerInterface.paymentForWork(10);
    }

}
