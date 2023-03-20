package com.example.interviewquestionsandanswers.javaBasics.dataTypesAndVaribles;

public class StringClassExample {

    //    Write a Java program to concatenate two strings.
    public void concatenateExample() {

        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + str2;
        System.out.println(result);
    }

    //    Write a Java program to find the length of a string.
    public void lengthOfString() {
        String str = "Hello,world";
        int length = str.length();
        System.out.println("the length of the String is " + length);
    }

//    Write a Java program to convert a string to uppercase.

    public void upperCaseExample() {
        String str = "hello world";
        String uppercase = str.toUpperCase();
        System.out.println(uppercase);
    }

//    Write a Java program to check if a string contains a specific substring.

    public void subStringExample() {
        String str = "Hello, world!";
        boolean contains = str.contains("world");
        System.out.println("Does the Spring contain 'word'? " + contains);

    }

    //    Write a Java program to split a string into an array of substrings.
    public void splitString() {
        String str = "Hello, world";
        String[] arr = str.split(",");
        for (String s : arr) {
            System.out.println(s.trim());
        }
    }
}
