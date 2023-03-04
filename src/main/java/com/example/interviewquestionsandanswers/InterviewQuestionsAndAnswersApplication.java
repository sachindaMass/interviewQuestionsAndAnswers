package com.example.interviewquestionsandanswers;

import com.example.interviewquestionsandanswers.abstractVsInterface.*;
import com.example.interviewquestionsandanswers.arrayListAndLinkedList.ArrayListExample;
import com.example.interviewquestionsandanswers.arrayListAndLinkedList.LinkedListExample;
import com.example.interviewquestionsandanswers.staticAndNonStatic.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedList;

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

        Book mythicalManMonth = new Book(); // create and instance of Book class
        Book.getPublisher();// legal to call static method directly from the class
        Book.getPublisher(); // legal to call static method form and "instance of a class"

//        Book.getTitle(); not legal to call  non-static method direction from the class
        mythicalManMonth.getTitle(); // legal to call non-static method from and instance of class.

//        sayHelloWorld(); not legal to call non-static method direction from a static method.

        InterviewQuestionsAndAnswersApplication interviewQuestionsAndAnswersApplication
                = new InterviewQuestionsAndAnswersApplication(); // create an instance of the library class.
        interviewQuestionsAndAnswersApplication.sayHelloWorld(); // legal to call a non-static method from an instance
        // of a class.

        LinkedListExample linkedListExample = new LinkedListExample() {
            @Override
            public LinkedList<String> getNameLinkedList() {
                return super.getNameLinkedList();
            }
        };

        linkedListExample.getNameLinkedList().add("John");
        linkedListExample.getNameLinkedList().add("Paul");
        linkedListExample.getNameLinkedList().add("George");
        linkedListExample.getNameLinkedList().add("Ringo");
        linkedListExample.getNameLinkedList().add(1, "Jerry");
        System.out.println(linkedListExample.getNameLinkedList().get(2));

        ArrayListExample arrayListExample = new ArrayListExample() {
            @Override
            public ArrayList<String> getNameArrayList() {
                return super.getNameArrayList();
            }
        };

        arrayListExample.getNameArrayList().add("John");
        arrayListExample.getNameArrayList().add("Paul");
        arrayListExample.getNameArrayList().add("George");
        arrayListExample.getNameArrayList().add("Ringo");
        arrayListExample.getNameArrayList().add(1, "Jerry");
        System.out.println(arrayListExample.getNameArrayList().get(2));

    }

    public void sayHelloWorld() {
        System.out.println("Hello World");
    }

}
