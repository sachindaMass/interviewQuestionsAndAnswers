package com.example.interviewquestionsandanswers.javaBasics;

public class ConditionalAndLoops {

//    Write a Java program to check if a number is even or odd.

    public void oddOrEven() {

        int num = 5;
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

//    Write a Java program to find the largest of three numbers.

    public void largestThreeNumbers() {

        int num1 = 5;
        int num2 = 10;
        int num3 = 7;
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("The Largest number is " + largest);
    }

    //    Write a Java program to print numbers from 1 to 10 using a for loop.
    public void oneToTenNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

