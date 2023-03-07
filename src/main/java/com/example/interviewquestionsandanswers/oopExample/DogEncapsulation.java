/*
 * @created 07/03/2023 - 4:49 PM
 * @project interviewQuestionsAndAnswers
 * @author  Dell-PC
 */
package com.example.interviewquestionsandanswers.oopExample;

public class DogEncapsulation {

//    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.

    String color;
    String name;
    String breed;
    int age;

    public DogEncapsulation(){}

    public DogEncapsulation(String color, String name, String breed, int age) {
        this.color = color;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void wagTail(){
        System.out.println("Dog wag their tails");
    }

    public void barking(){
        System.out.println("Dog barks");
    }

    public void eating(){
        System.out.println("Dog Eats");
    }
}
