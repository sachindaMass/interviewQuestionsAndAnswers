package com.example.interviewquestionsandanswers.lambdaExample;

public class Cat implements Printable {

    public String name;
    public int age;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void print(String prefix, String suffix) {
        System.out.println("Meow");
    }
}
