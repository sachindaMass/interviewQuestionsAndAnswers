package com.example.interviewquestionsandanswers.javaBasics;

public class OperatorAndExpressions {
    //    Write a Java program to perform addition of two numbers.
    public void additionExample() {

        int num1 = 5;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println("The Sum is " + sum);
    }

//    Write a Java program to perform multiplication of two numbers.

    public void multiplicationExample() {

        int num1 = 5;
        int num2 = 7;
        int product = num1 * num2;
        System.out.println("The product is " + product);
    }

//    Write a Java program to perform logical AND operation on two boolean values.

    public void andOperationExample() {

        boolean bool1 = true;
        boolean bool2 = false;
        boolean result = bool1 && bool2;
        System.out.println("The result is " + result);
    }

//    Write a Java program to perform bitwise OR operation on two integer values.

    public void orOperationExample() {

        int num1 = 5;
        int num2 = 7;
        int result = num1 | num2;
        System.out.println("or operation Result is " + result);
    }

//    Write a Java program to perform ternary operator on a boolean value.

    public void ternaryOperatorsExample() {
        boolean flag = true;
        String message = flag ? "It is true" : "It is false";
        System.out.println(message);
    }
}
