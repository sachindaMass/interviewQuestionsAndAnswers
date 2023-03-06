package com.example.interviewquestionsandanswers.stringAreImmutable;

public class StringImmutable {

    public void StringChecks() {
        // String same values are same memory location.
        String name = "John";
        String anotherName = "John";

        String aThirdName = new String ("John"); // save in new memory location

        System.out.println("(name == anotherName) = " + (name == anotherName));
        System.out.println("(name == aThirdName) = " + (name == aThirdName));
        System.out.println(name + " " + anotherName);

        addMoneyToAccount(name,5000);
    }

    public void addMoneyToAccount(String accountHolder,int moneyToAdd){

    }
}
