package com.example.interviewquestionsandanswers.staticAndNonStatic;

public class Book {

    private static String publisher = "Addison-Wesley"; // class variable

    private String title = "The Mythical Man-Month"; // instance variable

    public static String getPublisher(){ //static methods can access class variable
        return publisher;
    }

    public String getTitle(){ // non-static methods can access class variable and instance variable
        return title;
    }
}
