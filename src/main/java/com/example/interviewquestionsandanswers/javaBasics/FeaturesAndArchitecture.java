package com.example.interviewquestionsandanswers.javaBasics;

public class FeaturesAndArchitecture {
    //    Write a Java program that demonstrates encapsulation.
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //    Write a Java program that demonstrates inheritance.
    public void inheritanceExample() {
        class Animal {
            public void sound() {
                System.out.println("The Animal makes a sound");
            }
        }

        class Dog extends Animal {
            public void sound() {
                System.out.println("The dog barks");
            }
        }

        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();
    }

//    Write a Java program that demonstrates polymorphism.

    public void polymorphismExample() {

        class Shape {
            public void draw() {
                System.out.println("Drawing a shape");
            }
        }

        class Circle extends Shape {
            public void draw() {
                System.out.println("Drawing a circle");
            }
        }

        class Square extends Shape {
            @Override
            public void draw() {
                System.out.println("Drawing a square");
            }
        }

        Shape[] shapes = {new Circle(), new Square()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

//    Write a Java program that demonstrates abstraction.

    public void abstractionExample() {

        abstract class Animal {
            public abstract void sound();
        }

        class Dog extends Animal {
            public void sound() {
                System.out.println("The dog barks");
            }
        }

        Animal animal = new Dog();
        animal.sound();
    }

//    Write a Java program that demonstrates interface.

    public void interfaceExample() {
        interface Animal {
            void sound();
        }

        class Dog implements Animal {

            @Override
            public void sound() {
                System.out.println("The Dog barks in interface");
            }
        }

        Animal animal = new Dog();
        animal.sound();
    }
}
