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

//    Q: What is the difference between the if and switch statements in Java?
//
//A: The if statement tests a single condition and executes a block of code if the condition is true.
// The switch statement tests a variable against a series of cases and executes the code associated with the first matching case.
// Here's an example of each:

    public void ifAndSwitch() {
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        int y = 3;
        switch (y) {
            case 1:
                System.out.println("y is 1");
                break;
            case 2:
                System.out.println("y is 2");
                break;
            default:
                System.out.println("y is neither 1 nor 2");
                break;
        }
    }

//    Q: What is the difference between a while loop and a do-while loop in Java?
//
//A: A while loop tests a condition before executing the loop body,
// while a do-while loop tests the condition after executing the loop body.
// This means that a do-while loop will always execute its body at least once, even if the condition is false.
// Here's an example of each:

    public void whileLoopAndDoWhile() {
        // while loop example
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do-while loop example
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

    }

    //    Q: What is the difference between a for loop and a foreach loop in Java?
//
//A: A for loop is a general-purpose loop that can iterate over a range of values,
// while a foreach loop is used specifically to iterate over the elements of an array or collection.
// Here's an example of each:
    public void forLoopAndForeachLoop() {
        // for loop example
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // foreach loop example
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }

    }

//    Q: How can you exit from a loop in Java?
//
//A: You can use the break statement to exit from a loop prematurely.
// The break statement is usually used with an if statement to test a condition and exit the loop if the condition is true.
// Here's an example:

    public void exitLoop() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // exit loop if i is 3
            }
            System.out.println(i);
        }

    }

//    Q: How can you skip an iteration of a loop in Java?
//
//A: You can use the continue statement to skip the current iteration of a loop and move on to the next one.
// The continue statement is usually used with an if statement to test a condition and skip the iteration if the condition is true.
// Here's an example:

    public void skipOfLoop() {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // skip iteration if i is 2
            }
            System.out.println(i);
        }

    }

}

