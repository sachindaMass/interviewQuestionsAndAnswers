package com.example.interviewquestionsandanswers.finalKeyWord;

import com.example.interviewquestionsandanswers.InterviewQuestionsAndAnswersApplication;

public class Dog extends Animal {

    private int walkDistancePreference;

    public Dog(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }

    public Dog(String name, String color, int walkDistancePreference) {
        super(name, color);
        this.walkDistancePreference = walkDistancePreference;
    }

    public int getWalkDistancePreference() {
        return walkDistancePreference;
    }

    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }

    public void bark() {
        System.out.println("woof");
    }

    public void eat() {
        System.out.println("nom nom nom" + InterviewQuestionsAndAnswersApplication.PI_VALUE);
    }


}
