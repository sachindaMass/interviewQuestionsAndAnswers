package com.example.interviewquestionsandanswers.upCastingAndDownCasting;

public class Animal {

    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("I'm just an Animal");
    }
}
