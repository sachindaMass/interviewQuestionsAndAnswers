package com.example.interviewquestionsandanswers.superKeyword;

public class Animal {

    int age;
    String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Hello, I am an animal");
    }

    public void eat() {
        System.out.println("Munch Munch");
    }

    private void doSomethingPrivate() {
        System.out.println("Hey this method is private");
    }
}
