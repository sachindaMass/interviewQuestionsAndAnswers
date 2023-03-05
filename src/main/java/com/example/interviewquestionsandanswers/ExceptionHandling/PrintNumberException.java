package com.example.interviewquestionsandanswers.ExceptionHandling;

public class PrintNumberException {

    public int printNumber() {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally { //finally, block always executes
            return 5;
        }

    }
}
