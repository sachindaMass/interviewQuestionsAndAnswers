package com.example.interviewquestionsandanswers.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionHandling {

    public void readFile(String filename) throws FileNotFoundException {
//        try {
//            FileReader reader = new FileReader(filename);
//        } catch (FileNotFoundException e) {
////            e.printStackTrace();
//            System.out.println("File does not exist!");
//        }

        FileReader reader = new FileReader(filename);
    }
}
