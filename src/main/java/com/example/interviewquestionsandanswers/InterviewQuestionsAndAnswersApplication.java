package com.example.interviewquestionsandanswers;

import com.example.interviewquestionsandanswers.SetAndHashSet.SetExample;
import com.example.interviewquestionsandanswers.abstractVsInterface.*;
import com.example.interviewquestionsandanswers.arrayListAndLinkedList.ArrayListExample;
import com.example.interviewquestionsandanswers.arrayListAndLinkedList.LinkedListExample;
import com.example.interviewquestionsandanswers.lambdaExample.Cat;
import com.example.interviewquestionsandanswers.lambdaExample.Printable;
import com.example.interviewquestionsandanswers.mapAndHashMap.MapsExample;
import com.example.interviewquestionsandanswers.multithreadExample.MultiThreadExample;
import com.example.interviewquestionsandanswers.multithreadExample.MultiThreadExmple2;
import com.example.interviewquestionsandanswers.staticAndNonStatic.Book;
import com.example.interviewquestionsandanswers.thisKeyword.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class InterviewQuestionsAndAnswersApplication {

    public static final double PI_VALUE = 3.14159;
//    private static final double PI_VALUE = 3.14159;

    public static void main(String[] args) {
        SpringApplication.run(InterviewQuestionsAndAnswersApplication.class, args);

//        abstractAndInterface();
//
//        staticAndNonStatic();
//
//        linkedListMethod();
//
//        arrayListMethod();
//
//        mapsAndHashMapsAndTrees();
//
//        lambdaExpression();
//
//        multiThreadingMethod();
//
//        thisKeyword();
//
//        superKeyWord();
//
//        finalKeyWord();

    }

    private static void finalKeyWord() {
        com.example.interviewquestionsandanswers.finalKeyWord.Dog dog
                = new com.example.interviewquestionsandanswers.finalKeyWord.Dog
                ("Bella", "White", 5);
//        final com.example.interviewquestionsandanswers.finalKeyWord.Dog myDog
//                = new com.example.interviewquestionsandanswers.finalKeyWord.Dog(5); // final Dog class
        dog.eat();
        System.out.println(dog.getName() + " " + dog.getColor() + " " + dog.getWalkDistancePreference());

//        final double pi = 3.14159; // it never changed

        System.out.println(PI_VALUE * 3);
    }

    private static void superKeyWord() {
        com.example.interviewquestionsandanswers.superKeyword.Cat cat
                = new com.example.interviewquestionsandanswers.superKeyword.Cat
                (5, "Shirmal", "Fish");
        cat.makeNoise();
        System.out.println(cat.getAge() + " " + cat.getName() + " " + cat.getCatFoodPreference());
    }

    private static void thisKeyword() {
        Dog dog = new Dog();
        dog.setName("Bella");
        System.out.println(dog.getName());
    }

    private static void multiThreadingMethod() {
        for (int i = 0; i <= 5; i++) {
            MultiThreadExample myExample = new MultiThreadExample(i);
            MultiThreadExmple2 myExample2 = new MultiThreadExmple2(i);
            myExample.start();
            Thread myThread = new Thread(myExample2);
            myThread.start();
        }
//        throw new RuntimeException();
//        MultiThreadExample myExample2 = new MultiThreadExample();
//        myExample.start(); //multiple concurrent from start
//        myExample2.start();
//        myExample2.run(); // run allows to run thread one after another

//        ----------------------------------------------------------------------------------------
    }

    private static void lambdaExpression() {
        Cat myCat = new Cat();
//        myCat.print();
//        printThing(myCat); // insted of myCat.print()

        Printable lambdaPrintable = (p, s) -> System.out.println("Meow" + s);
        printThing(lambdaPrintable); //lambda expression
        printThing((p, s) -> {
            System.out.println("Meow");
        }); //Lambda expression

//        ----------------------------------------------------------------------------------------
    }

    private static void mapsAndHashMapsAndTrees() {
        MapsExample mapsExample = new MapsExample();
        mapsExample.getEmpId().put("John", 12345);
        mapsExample.getEmpId().put("Carl", 54321);
        mapsExample.getEmpId().put("Jerry", 876969);

        System.out.println(mapsExample.getEmpIdMap());
        System.out.println(mapsExample.getEmpIdMap().get("Carl"));
        System.out.println(mapsExample.getEmpId().containsKey("John"));
        System.out.println(mapsExample.getEmpIdMap().containsValue(5));

        mapsExample.getEmpId().replace("John", 7777);
        System.out.println(mapsExample.getEmpIdMap());

        SetExample setExample = new SetExample();
        setExample.getNamesSet().add("John");
        setExample.getNamesSet().add("Walter");
        setExample.getNamesSet().add("Skyler");
        setExample.getNamesSet().add("Mike");

        setExample.getNamesSet().remove("Walter");
        System.out.println(setExample.getNamesSet());

//        setExample.getNamesSet().forEach(System.out::println);
//        setExample.getNamesSet().iterator();

        Iterator<String> nameIterator = setExample.getNamesSet().iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        setExample.getNumberList().add(1);
        setExample.getNumberList().add(2);
        setExample.getNumberList().add(3);
        setExample.getNumberList().add(3);
        setExample.getNumberList().add(2);

        System.out.println(setExample.getNumberList());

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(setExample.getNumberList());
        System.out.println(numberSet);

        // treeSet gives natural order
        // LinkedHashSet gives insertion order

//        ----------------------------------------------------------------------------------------
    }

    private static void arrayListMethod() {
        ArrayListExample arrayListExample = new ArrayListExample() {
            @Override
            public ArrayList<String> getNameArrayList() {
                return super.getNameArrayList();
            }
        };

        arrayListExample.getNameArrayList().add("John");
        arrayListExample.getNameArrayList().add("Paul");
        arrayListExample.getNameArrayList().add("George");
        arrayListExample.getNameArrayList().add("Ringo");
        arrayListExample.getNameArrayList().add(1, "Jerry");
        System.out.println(arrayListExample.getNameArrayList().get(2));

//        ----------------------------------------------------------------------------------------
    }

    private static void linkedListMethod() {
        InterviewQuestionsAndAnswersApplication interviewQuestionsAndAnswersApplication
                = new InterviewQuestionsAndAnswersApplication(); // create an instance of the library class.
        interviewQuestionsAndAnswersApplication.sayHelloWorld(); // legal to call a non-static method from an instance
        // of a class.

        LinkedListExample linkedListExample = new LinkedListExample() {
            @Override
            public LinkedList<String> getNameLinkedList() {
                return super.getNameLinkedList();
            }
        };

        linkedListExample.getNameLinkedList().add("John");
        linkedListExample.getNameLinkedList().add("Paul");
        linkedListExample.getNameLinkedList().add("George");
        linkedListExample.getNameLinkedList().add("Ringo");
        linkedListExample.getNameLinkedList().add(1, "Jerry");
        System.out.println(linkedListExample.getNameLinkedList().get(2));

//        ----------------------------------------------------------------------------------------
    }

    private static void staticAndNonStatic() {
        //        ----------------------------------------------------------------------------------------

        Book mythicalManMonth = new Book(); // create and instance of Book class
        Book.getPublisher();// legal to call static method directly from the class
        Book.getPublisher(); // legal to call static method form and "instance of a class"

//        Book.getTitle(); not legal to call  non-static method direction from the class
        mythicalManMonth.getTitle(); // legal to call non-static method from and instance of class.

//        sayHelloWorld(); not legal to call non-static method direction from a static method.

//        ----------------------------------------------------------------------------------------
    }

    private static void abstractAndInterface() {
        Wrestler wrestler1 = new Kane();
        Wrestler wrestler2 = new StoneCold();

        wrestler1.themeMusic();
        wrestler1.finisher();
        wrestler1.paymentForWork(5);

        wrestler2.themeMusic();
        wrestler2.finisher();
        wrestler2.paymentForWork(3);

        WrestlerInterface wrestlerInterface = new StoneColdInter();

        wrestlerInterface.themeMusic();
        wrestlerInterface.finisher();
        wrestlerInterface.paymentForWork(10);
    }

    static void printThing(Printable thing) {
        thing.print("!", "!");
    }

    public void sayHelloWorld() {
        System.out.println("Hello World");
    }


}
