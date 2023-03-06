package com.example.interviewquestionsandanswers.annotationExampls;

@VeryImportant
public class Cat {


    String name;
    int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Munch");
    }

}
