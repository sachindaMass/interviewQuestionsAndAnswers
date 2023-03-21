package com.example.interviewquestionsandanswers.javaBasics;

public class OOPConceptInDepth {
//    Q: What is object-oriented programming (OOP)?
//
//A: Object-oriented programming (OOP) is a programming paradigm that uses objects and their interactions to design and implement software systems.
// OOP focuses on concepts such as encapsulation, inheritance, polymorphism, and abstraction to build reusable, maintainable, and scalable software.

    //Q: What is encapsulation in Java?
//
//A: Encapsulation is the process of hiding the implementation details of an object and exposing only the necessary features
// to the outside world. In Java, encapsulation is achieved through access modifiers such as private, public, protected,
// and default. Private variables and methods are only accessible within the same class, while public variables and methods are accessible from any class.
    public void encapsulationExample() {
        class Student {
            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

    }

//    Q: What is inheritance in Java?
//
//A: Inheritance is a mechanism in Java that allows one class to inherit the properties and methods of another class.
// The class that inherits is called the subclass, and the class that is inherited from is called the superclass.
// Inheritance is used to reuse code, promote code reuse, and build complex software systems.

    public void inheritanceExample() {
        class Animal {
            public void eat() {
                System.out.println("Animal is eating");
            }
        }

        class Dog extends Animal {
            public void bark() {
                System.out.println("Dog is barking");
            }
        }
        Dog dog = new Dog();
        dog.eat(); // output: Animal is eating
        dog.bark(); // output: Dog is barking
    }

//    Q: What is polymorphism in Java?
//
//A: Polymorphism is a concept in Java that allows objects to take on multiple forms. There are two types of polymorphism in Java:
// compile-time polymorphism and runtime polymorphism. Compile-time polymorphism is achieved through method overloading,
// while runtime polymorphism is achieved through method overriding.

    public void polymorphismExample() {
        class Animal {
            public void makeSound() {
                System.out.println("Animal is making a sound");
            }
        }

        class Dog extends Animal {
            public void makeSound() {
                System.out.println("Dog is barking");
            }
        }

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound(); // output: Animal is making a sound
        dog.makeSound(); // output: Dog is barking

        Animal animal2 = new Dog();
        animal2.makeSound(); // output: Dog is barking
    }

//    Q: What is abstraction in Java?
//
//A: Abstraction is the process of hiding the complexity of an object and only exposing the necessary details to the user.
// In Java, abstraction is achieved through interfaces and abstract classes. An interface is a collection of abstract methods,
// while an abstract class is a class that cannot be instantiated and may contain both abstract and concrete methods.

    public void abstractionExample() {
        interface Animal {
            void makeSound();
        }

        class Dog implements Animal {
            public void makeSound() {
                System.out.println("Dog is barking");
            }
        }
        Animal animal = new Dog();
        animal.makeSound(); // output: Dog is barking
    }
}
