/*
 * @created 07/03/2023 - 5:19 PM
 * @project interviewQuestionsAndAnswers
 * @author  Dell-PC
 */
package com.example.interviewquestionsandanswers.oopExample;

public class DogPolymoreExample extends PolymorphismExample {

    private int breed;

    public DogPolymoreExample() {
    }

    public DogPolymoreExample(int breed) {
        this.breed = breed;
    }

    public DogPolymoreExample(String name, String color, int breed) {
        super(name, color);
        this.breed = breed;
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println("Chomp chomp");
    }

    public void eat(int numberOfTimes) {
        System.out.println("Chomp chomp");
    }
}
