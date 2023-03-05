package com.example.interviewquestionsandanswers.superKeyword;

public class Cat extends Animal {

    String catFoodPreference;

    public Cat(int age, String name, String catFoodPreference) {
        super(age, name);
        this.catFoodPreference = catFoodPreference;
    }

    public String getCatFoodPreference() {
        return catFoodPreference;
    }

    public void setCatFoodPreference(String catFoodPreference) {
        this.catFoodPreference = catFoodPreference;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow meow");

        super.eat();
//        eat();
//        super.doSomethingPrivate(); // cant to for the private method, only allow for parent class public method
    }

}
